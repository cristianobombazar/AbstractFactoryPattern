package br.com.aula.singleton;

import java.util.Objects;

class Incremental {
    private static int count = 0;
    private int numero;
    private static Incremental instance;

    static Incremental getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Incremental();
        }
        return instance;
    }

    private Incremental() {

    }

    void increment() {
        numero = ++count;
    }

    public String toString() {
        return "Incremental " + numero;
    }
}

public class TesteIncremental {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental.getInstance().increment();
            System.out.println(Incremental.getInstance().toString());
        }
    }
}