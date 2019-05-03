package br.com.aula.abstractFactory.exercicio2.factory;

import br.com.aula.abstractFactory.exercicio2.enums.Pizza;

public class PizzaFactory {
    public static Pizza create(String flavor){
        return Pizza.of(flavor);
    }
}
