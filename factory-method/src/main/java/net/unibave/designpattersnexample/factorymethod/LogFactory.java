package net.unibave.designpattersnexample.factorymethod;

public class LogFactory {

    public static Log create(String type) {
        return type.equals("arquivo") ? new LogArquivo() : new LogConsole();
    }

}
