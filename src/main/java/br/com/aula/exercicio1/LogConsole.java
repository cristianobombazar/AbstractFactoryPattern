package br.com.aula.exercicio1;

import br.com.aula.exercicio1.interfaces.Log;

import java.io.IOException;

public class LogConsole implements Log {

    @Override
    public void print(String string) throws IOException {
        System.out.println(string);
    }
}
