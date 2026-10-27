package org.example.patterns.estruturais.bridge.solution;

public class BridgeSolucao {
    public static void main(String[] args) {
        Canal email = new CanalEmail();
        Canal sms = new CanalSMS();
        Canal push = new CanalPush();      // canal novo: 1 classe

        new Alerta(email).enviar("ana@mail.com");
        new Alerta(sms).enviar("+55 45 99999-0000");
        new Promocao(push).enviar("token-app-123");
        new Lembrete(email).enviar("ana@mail.com");   // tipo novo: 1 classe
    }
}
