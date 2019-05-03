package net.unibave.designpattersnexample.abstractfactory;

public class LogRunner {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final var log = LogFactory.create();
            log.print("Hello World!");
        }
    }

}
