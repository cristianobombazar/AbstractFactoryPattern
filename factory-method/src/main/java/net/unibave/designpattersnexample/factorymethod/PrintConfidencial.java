package net.unibave.designpattersnexample.factorymethod;

public class PrintConfidencial implements Print {

    @Override
    public void print() {
        System.out.println("Estas são informações confidenciais,\n" +
                "o que significa que você\n" +
                "provavelmente sabe a palavra secreta!");
    }

}
