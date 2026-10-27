package org.example.patterns.estruturais.facade.solution;

public class AppMobileController {
    private final CheckoutFacade checkout;

    public AppMobileController(CheckoutFacade checkout) {
        this.checkout = checkout;
    }

    public void finalizar(String cliente, String sku, int qtd, String cartao, String cep) {
        checkout.finalizarCompra(cliente, sku, qtd, cartao, cep);
    }
}
