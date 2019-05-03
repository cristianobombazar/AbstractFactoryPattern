package br.com.aula.abstractFactory.exercicio1;

import br.com.aula.abstractFactory.exercicio1.interfaces.Log;

import java.io.IOException;

class LogConsole implements Log {

    @Override
    public void print(String string) throws IOException {
        System.out.println(string);
    }
}
