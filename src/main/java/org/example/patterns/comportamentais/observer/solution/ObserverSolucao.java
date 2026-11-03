package org.example.patterns.comportamentais.observer.solution;

public class ObserverSolucao {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook");
        Observador push = new NotificadorPush();

        notebook.inscrever(new NotificadorEmail());
        notebook.inscrever(push);
        notebook.inscrever(new PainelCompras());

        notebook.repor(10);        // avisa os três
        notebook.cancelar(push);   // o push deixa de receber
        notebook.vender(10);
        notebook.repor(5);         // avisa só e-mail e painel
    }
}
