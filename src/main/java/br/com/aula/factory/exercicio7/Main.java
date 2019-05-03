package br.com.aula.factory.exercicio7;

import br.com.aula.abstractFactory.exercicio1.interfaces.Log;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Log log = LogFactory.create("arquivo");
        StringBuilder stringToPrint = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            stringToPrint.append(i).append(" - ");
        }

        log.print(stringToPrint.toString());
    }
}
