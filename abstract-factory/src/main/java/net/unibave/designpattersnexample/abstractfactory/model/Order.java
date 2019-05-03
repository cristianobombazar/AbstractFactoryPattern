package net.unibave.designpattersnexample.abstractfactory.model;

import java.time.LocalDate;
import java.util.List;

import net.unibave.designpattersnexample.abstractfactory.interfaces.Massa;

public class Order {
    private LocalDate dateOrder;
    private Pizzaria pizzaria;
    private List<Massa> products;

    private Order(LocalDate dateOrder, Pizzaria pizzaria, List<Massa> products) {
        this.dateOrder = dateOrder;
        this.pizzaria = pizzaria;
        this.products = products;
    }

    public static Order of(LocalDate localDate, Pizzaria pizzaria, List<Massa> products) {
        return new Order(localDate, pizzaria, products);
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public Pizzaria getPizzaria() {
        return pizzaria;
    }

    public List<Massa> getProducts() {
        return products;
    }
}
