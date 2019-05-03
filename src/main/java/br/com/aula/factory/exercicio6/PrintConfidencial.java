package br.com.aula.factory.exercicio6;

import br.com.aula.factory.exercicio6.print.Print;

public class PrintConfidencial implements Print {
    @Override
    public void print() {
        System.out.println("Estas são informações confidenciais,\n" +
                "o que significa que você\n" +
                "provavelmente sabe a palavra secreta!");
    }
}
