package org.example.patterns.criacionais.singleton.solution;

import org.example.patterns.criacionais.singleton.solution.services.ClienteService;
import org.example.patterns.criacionais.singleton.solution.services.PagamentoService;
import org.example.patterns.criacionais.singleton.solution.services.PedidoService;

public class SingletonLoggerSolucao {
    public static void main(String[] args) {
        // Prova de que é a mesma instância
        System.out.println("Mesma instância? "
                + (AppLogger.getInstance() == AppLogger.getInstance()));   // true

        PedidoService pedidos = new PedidoService();
        ClienteService clientes = new ClienteService();
        PagamentoService pagamentos = new PagamentoService();

        // Liga o DEBUG UMA vez: vale para todos os serviços
        AppLogger.getInstance().setNivelMinimo(Nivel.DEBUG);

        pedidos.criarPedido();
        clientes.cadastrar();
        pagamentos.cobrar();
    }
}
