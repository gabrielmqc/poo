package org.example.patterns.estruturais.facade.solution;

// FACADE: uma interface simples que esconde a orquestração
public class CheckoutFacade {
    private final Estoque estoque = new Estoque();
    private final Frete frete = new Frete();
    private final Pagamento pagamento = new Pagamento();
    private final NotaFiscal notaFiscal = new NotaFiscal();
    private final EmailService email = new EmailService();

    boolean finalizarCompra(String cliente, String sku, int qtd, String cartao, String cep) {
        if (!estoque.reservar(sku, qtd)) return false;

        double total = 50.0 * qtd + frete.calcular(cep);
        if (!pagamento.cobrar(cartao, total)) {
            estoque.liberar(sku, qtd);
            return false;
        }
        String nf = notaFiscal.emitir(cliente, total);
        email.enviar(cliente, "Compra concluída. " + nf);
        return true;
    }
}
