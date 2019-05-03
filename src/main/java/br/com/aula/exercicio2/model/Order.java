package br.com.aula.exercicio2.model;

import br.com.aula.exercicio2.interfaces.Massa;

import java.time.LocalDate;
import java.util.List;

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
