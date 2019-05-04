package net.unibave.designpattersnexample.singleton;

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

    private Incremental() {}

    void increment() {
        numero = ++count;
    }

    public String toString() {
        return "Incremental " + numero;
    }

}