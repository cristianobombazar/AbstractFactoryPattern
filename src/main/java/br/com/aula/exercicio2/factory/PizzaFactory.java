package br.com.aula.exercicio2.factory;

import br.com.aula.exercicio2.enums.Pizza;

public class PizzaFactory {
    public static Pizza create(String flavor){
        return Pizza.of(flavor);
    }
}
