package org.example.patterns.singleton.problem;

public class AppLogger {
    private static int instanciasCriadas = 0;

    private final int id;
    private Nivel nivelMinimo = Nivel.INFO;

    // Construtor público: cada "new" cria um logger independente
    public AppLogger() {
        this.id = ++instanciasCriadas;
        System.out.println("[SISTEMA] Abrindo recurso de log (AppLogger #" + id + ")");
    }

    public void setNivelMinimo(Nivel nivel) {
        this.nivelMinimo = nivel;
    }

    public void log(Nivel nivel, String mensagem) {
        if (nivel.ordinal() >= nivelMinimo.ordinal()) {
            System.out.println("[AppLogger #" + id + "] " + nivel + " - " + mensagem);
        }
    }

    public static int getInstanciasCriadas() {
        return instanciasCriadas;
    }
}
