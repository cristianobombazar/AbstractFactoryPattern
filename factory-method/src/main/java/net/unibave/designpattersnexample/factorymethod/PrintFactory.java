package net.unibave.designpattersnexample.factorymethod;

public class PrintFactory {

    public Print create(String type) {
        return type.equals("public") ? new PrintPublico() : new PrintConfidencial();
    }

}
