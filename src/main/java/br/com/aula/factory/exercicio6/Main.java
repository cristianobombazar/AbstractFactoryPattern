package br.com.aula.factory.exercicio6;

public class Main {

    public static void main(String[] args) {
        PrintFactory factory = new PrintFactory();
        factory.create("public").print();

    }

}
