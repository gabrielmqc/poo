package org.example.patterns.criacionais.builder.solution;

// BUILDER: contrato das etapas de construção
public interface Builder {
    void definirUrl(String url);

    void definirMetodo(String metodo);

    void adicionarHeader(String chave, String valor);

    void definirCorpo(String corpo);

    void definirTimeout(int segundos);

    void definirTentativas(int quantidade);

    void definirToken(String token);

    void seguirRedirects(boolean seguir);

    void verificarSsl(boolean verificar);

    Requisicao build();
}
