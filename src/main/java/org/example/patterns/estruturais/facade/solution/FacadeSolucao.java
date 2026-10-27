package org.example.patterns.estruturais.facade.solution;

public class FacadeSolucao {
    public static void main(String[] args) {
        CheckoutFacade checkout = new CheckoutFacade();

        new CheckoutController(checkout).finalizar("ana@mail.com", "SKU-1", 2, "4111", "85800-000");
        new AppMobileController(checkout).finalizar("bia@mail.com", "SKU-1", 1, "5500", "85801-000");
    }
}
