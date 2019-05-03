package br.com.aula.factory.exercicio7;

import br.com.aula.abstractFactory.exercicio1.interfaces.Log;

public class LogFactory {
    public static Log create(String type) {
        return type.equals("arquivo") ? new LogArquivo() : new LogConsole();
    }
}
