package br.com.aula.exercicio1;

import br.com.aula.exercicio1.interfaces.Log;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            Log log = LogFactory.create();
            log.print("Hello World!");
        }
    }
}
