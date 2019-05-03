package net.unibave.designpattersnexample.abstractfactory.factory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.unibave.designpattersnexample.abstractfactory.Util;
import net.unibave.designpattersnexample.abstractfactory.interfaces.Massa;
import net.unibave.designpattersnexample.abstractfactory.model.Order;

public class OrderFactory {

    public static Optional<Order> create(LocalDate date){
        final var pizzaria = PizzariaFactory.create("CRISTIANOS'S HAT");
        if (pizzaria.isClosed(date)){
            return Optional.empty();
        }
        final var massas = pizzaria.getAvaliableMassa(date);
        return Optional.of(Order.of(date, pizzaria, getRandomicMassa(massas)));
    }

    private static List<Massa> getRandomicMassa(List<Massa> massas){
        final var result = new ArrayList<Massa>();
        int qtd = Util.intBetween(1, massas.size());
        for (int i = 0; i < qtd; i++) {
            result.add(massas.get(Util.intBetween(0, massas.size()-1)));
        }
        return result;
    }

}
