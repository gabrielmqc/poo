package org.example.patterns.estruturais.facade.solution;

// Clientes: só conhecem a Facade
public class CheckoutController {
    private final CheckoutFacade checkout;

    public CheckoutController(CheckoutFacade checkout) {
        this.checkout = checkout;
    }

    public void finalizar(String cliente, String sku, int qtd, String cartao, String cep) {
        boolean ok = checkout.finalizarCompra(cliente, sku, qtd, cartao, cep);
        System.out.println(ok ? "Compra concluída" : "Compra não concluída");
    }
}
