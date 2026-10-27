package org.example.patterns.criacionais.singleton.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;

public class AppLogger {
    private static volatile AppLogger instancia;

    private static final Path ARQUIVO = Path.of("app.log");
    private Nivel nivelMinimo = Nivel.INFO;

    // Construtor PRIVADO: ninguém de fora consegue dar "new"
    private AppLogger() {
        System.out.println("[SISTEMA] AppLogger criado (acontece uma única vez)");
    }

    // Ponto de acesso global, com inicialização preguiçosa (lazy)
    // e double-checked locking para ser seguro em multithreading
    public static AppLogger getInstance() {
        if (instancia == null) {                         // 1ª checagem (sem lock)
            synchronized (AppLogger.class) {
                if (instancia == null) {                 // 2ª checagem (com lock)
                    instancia = new AppLogger();
                }
            }
        }
        return instancia;
    }

    public synchronized void setNivelMinimo(Nivel nivel) {
        this.nivelMinimo = nivel;
    }

    // synchronized: só uma thread grava por vez, as linhas não se misturam
    public synchronized void log(Nivel nivel, String origem, String mensagem) {
        if (nivel.ordinal() < nivelMinimo.ordinal()) return;

        String linha = LocalTime.now().withNano(0) + " " + nivel
                + " [" + origem + "] " + mensagem;
        System.out.println(linha);

        try {
            Files.writeString(ARQUIVO, linha + System.lineSeparator(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Falha ao gravar log: " + e.getMessage());
        }
    }
}
