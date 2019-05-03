package net.unibave.designpattersnexample.factorymethod;

public class PrintPublico implements Print {

    @Override
    public void print() {
        System.out.println("Estas são informações públicas sobre\n" +
                "qualquer coisa. Todo mundo pode ver\n" +
                "este arquivo.");
    }
    
}
