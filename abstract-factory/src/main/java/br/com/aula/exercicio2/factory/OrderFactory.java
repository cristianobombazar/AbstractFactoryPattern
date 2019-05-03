package br.com.aula.exercicio2.factory;

import br.com.aula.Util;
import br.com.aula.exercicio2.interfaces.Massa;
import br.com.aula.exercicio2.model.Order;
import br.com.aula.exercicio2.model.Pizzaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderFactory {

    public static Optional<Order> create(LocalDate date){
        Pizzaria pizzaria = PizzariaFactory.create("CRISTIANOS'S HAT");
        if (pizzaria.isClosed(date)){
            return Optional.empty();
        }
        List<Massa> massas = pizzaria.getAvaliableMassa(date);
        return Optional.of(Order.of(date, pizzaria, getRandomicMassa(massas)));
    }

    private static List<Massa> getRandomicMassa(List<Massa> massas){
        List<Massa> result = new ArrayList<>();
        int qtd = Util.intBetween(1, massas.size());
        for (int i = 0; i < qtd; i++) {
            result.add(massas.get(Util.intBetween(0, massas.size()-1)));
        }
        return result;
    }

}
