package org.example.patterns.estruturais.facade.problem;

// O cliente conhece TODOS os subsistemas e a ordem correta
public class CheckoutController {
    public void finalizar(String cliente, String sku, int qtd, String cartao, String cep) {
        Estoque estoque = new Estoque();
        Frete frete = new Frete();
        Pagamento pagamento = new Pagamento();
        NotaFiscal notaFiscal = new NotaFiscal();
        EmailService email = new EmailService();

        if (!estoque.reservar(sku, qtd)) {
            System.out.println("Sem estoque");
            return;
        }
        double total = 50.0 * qtd + frete.calcular(cep);
        if (!pagamento.cobrar(cartao, total)) {
            estoque.liberar(sku, qtd);                    // compensação manual
            System.out.println("Pagamento recusado");
            return;
        }
        String nf = notaFiscal.emitir(cliente, total);
        email.enviar(cliente, "Compra concluída. " + nf);
    }
}
