package org.example.patterns.estruturais.facade.problem;

public class FacadeProblem {
    public static void main(String[] args) {
        new CheckoutController().finalizar("ana@mail.com", "SKU-1", 2, "4111", "85800-000");
        new AppMobileController().finalizar("bia@mail.com", "SKU-1", 1, "5500", "85801-000");
    }
}
