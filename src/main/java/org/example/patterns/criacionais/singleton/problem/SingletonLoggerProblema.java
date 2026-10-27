package org.example.patterns.criacionais.singleton.problem;

import org.example.patterns.criacionais.singleton.problem.services.ClienteService;
import org.example.patterns.criacionais.singleton.problem.services.PagamentoService;
import org.example.patterns.criacionais.singleton.problem.services.PedidoService;

public class SingletonLoggerProblema {
    public static void main(String[] args) {
        PedidoService pedidos = new PedidoService();
        ClienteService clientes = new ClienteService();
        PagamentoService pagamentos = new PagamentoService();

        // O suporte quer investigar um bug e liga o DEBUG...
        pedidos.getLogger().setNivelMinimo(Nivel.DEBUG);

        // ...mas só o logger de Pedido muda
        pedidos.criarPedido();
        clientes.cadastrar();
        pagamentos.cobrar();

        System.out.println("Loggers criados: " + AppLogger.getInstanciasCriadas());  // 3
    }
}
