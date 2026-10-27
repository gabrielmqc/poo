package org.example.patterns.estruturais.bridge.problem;

public class BridgeProblema {
    public static void main(String[] args) {
        new AlertaEmail().enviar("ana@mail.com");
        new AlertaSMS().enviar("+55 45 99999-0000");
        new PromocaoEmail().enviar("ana@mail.com");
        new PromocaoSMS().enviar("+55 45 99999-0000");
    }
}
