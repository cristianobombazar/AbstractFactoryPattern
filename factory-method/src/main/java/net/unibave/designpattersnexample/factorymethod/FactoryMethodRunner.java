package net.unibave.designpattersnexample.factorymethod;

public class FactoryMethodRunner {

    public static void main(String[] args) {
        final var factory = new PrintFactory();
        factory.create("public").print();
    }

}
