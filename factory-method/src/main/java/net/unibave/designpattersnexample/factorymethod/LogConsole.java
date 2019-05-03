package net.unibave.designpattersnexample.factorymethod;

public class LogConsole implements Log {

    @Override
    public void print(String string) {
        System.out.println(string);
    }

}
