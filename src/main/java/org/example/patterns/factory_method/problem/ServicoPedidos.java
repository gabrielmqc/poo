package org.example.patterns.factory_method.problem;

public class ServicoPedidos {
    public void avisarCliente(String canal, String destino, String mensagem) {
        if (canal.equals("email")) {
            ServicoEmail servico = new ServicoEmail("smtp.loja.com");
            servico.enviarEmail(destino, "Seu pedido", mensagem);
        } else if (canal.equals("sms")) {
            ServicoSMS servico = new ServicoSMS("XYZ");
            servico.dispararSms(destino, mensagem);
        } else if (canal.equals("push")) {
            ServicoPush servico = new ServicoPush("ABC");
            servico.notificar(destino, mensagem);
        }
        // amanhã: else if (canal.equals("whatsapp")) { ... }
        else {
            throw new IllegalArgumentException("Canal inválido: " + canal);
        }
    }
}
