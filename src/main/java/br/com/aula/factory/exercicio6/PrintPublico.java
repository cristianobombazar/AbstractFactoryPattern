package br.com.aula.factory.exercicio6;

import br.com.aula.factory.exercicio6.print.Print;

public class PrintPublico implements Print {
    @Override
    public void print() {
        System.out.println("Estas são informações públicas sobre\n" +
                "qualquer coisa. Todo mundo pode ver\n" +
                "este arquivo.");
    }
}
