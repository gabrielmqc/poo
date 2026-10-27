package org.example.patterns.estruturais.facade.problem;

// O app mobile REPETE a mesma orquestração (e pode esquecer um passo)
public class AppMobileController {
    public void finalizar(String cliente, String sku, int qtd, String cartao, String cep) {
        Estoque estoque = new Estoque();
        Frete frete = new Frete();
        Pagamento pagamento = new Pagamento();
        EmailService email = new EmailService();

        estoque.reservar(sku, qtd);
        double total = 50.0 * qtd + frete.calcular(cep);
        pagamento.cobrar(cartao, total);
        email.enviar(cliente, "Compra concluída.");       // esqueceu a nota fiscal!
    }
}
