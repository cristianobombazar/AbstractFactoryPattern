package net.unibave.designpattersnexample.abstractfactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import net.unibave.designpattersnexample.abstractfactory.enums.Calzone;
import net.unibave.designpattersnexample.abstractfactory.factory.OrderFactory;
import net.unibave.designpattersnexample.abstractfactory.interfaces.Massa;

public class PizzariaRunner {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final var currentDate = Util.localDateBetween(2019, 2019);
            final var pedidoOptional = OrderFactory.create(currentDate);
            if (pedidoOptional.isPresent()) {
                System.out.println("======== PEDIDO ========");
                final var pedido = pedidoOptional.get();
                System.out.println("PIZZARIA: " + pedido.getPizzaria().getNome());
                System.out.println("Data: " + formatter(pedido.getDateOrder()));
                System.out.println("PRODUCTS: ");
                pedido.getProducts().forEach(massa -> {
                    System.out.println((isCalzone(massa) ? "Calzone of " : "Pizza of ") + massa.getFlavor());
                    System.out.println(">> INGREDIENTS <<");
                    massa.getIngredients().forEach(System.out::println);
                });
            } else {
                System.out.println("================");
                System.out.println("Não existem pizzarias abertas na data " + formatter(currentDate));
                System.out.println("================");
            }
        }
    }

    private static String formatter(LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static boolean isCalzone(Massa massa) {
        return massa instanceof Calzone;
    }

}
