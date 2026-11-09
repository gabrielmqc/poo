package org.example.patterns.comportamentais.interpreter.problem;

public class InterpreterProblema {
    public static void main(String[] args) {
        Cliente ana = new Cliente(true, 120, "BR");
        Cliente bia = new Cliente(true, 800, "US");
        Cliente caio = new Cliente(false, 900, "BR");

        System.out.println("Ana: " + elegivel(ana));    // true  (VIP e do Brasil)
        System.out.println("Bia: " + elegivel(bia));    // true  (VIP e total > 500)
        System.out.println("Caio: " + elegivel(caio));  // false (não é VIP)
    }

    // A regra está FIXA no código
    static boolean elegivel(Cliente c) {
        return c.vip() && (c.pais().equals("BR") || c.total() > 500);
    }

}
