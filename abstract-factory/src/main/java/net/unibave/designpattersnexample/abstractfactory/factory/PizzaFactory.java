package net.unibave.designpattersnexample.abstractfactory.factory;

import net.unibave.designpattersnexample.abstractfactory.enums.Pizza;

class PizzaFactory {

    static Pizza create(String flavor){
        return Pizza.of(flavor);
    }

}
