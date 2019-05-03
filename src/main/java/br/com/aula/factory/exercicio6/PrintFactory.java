package br.com.aula.factory.exercicio6;

import br.com.aula.factory.exercicio6.print.Print;

public class PrintFactory {

    public Print create(String type) {
        return type.equals("public") ? new PrintPublico() : new PrintConfidencial();
    }
}
