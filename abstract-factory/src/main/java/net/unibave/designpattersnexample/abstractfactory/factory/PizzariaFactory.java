package net.unibave.designpattersnexample.abstractfactory.factory;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.unibave.designpattersnexample.abstractfactory.interfaces.Massa;
import net.unibave.designpattersnexample.abstractfactory.model.Pizzaria;

public class PizzariaFactory {

    public static Pizzaria create(String nome){
        return Pizzaria.of(nome, getMassasOfDay());
    }

    private static Map<DayOfWeek, List<Massa>> getMassasOfDay(){
        final var calzonePresunto = CalzoneFactory.create("presunto");
        final var calzoneCalabresa = CalzoneFactory.create("calabresa");
        final var pizzaPresunto = PizzaFactory.create("presunto");
        final var pizzaCalabresa = PizzaFactory.create("calabresa");
        final var massasOfMonday = Arrays.<Massa>asList(calzoneCalabresa, pizzaCalabresa);
        final var massasOfTuesday = Arrays.<Massa>asList(calzonePresunto, pizzaPresunto);
        final var massasOfDay = new HashMap<DayOfWeek, List<Massa>>();
        massasOfDay.put(DayOfWeek.MONDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.TUESDAY, massasOfTuesday);
        massasOfDay.put(DayOfWeek.WEDNESDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.THURSDAY, massasOfTuesday);
        massasOfDay.put(DayOfWeek.FRIDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.SATURDAY, massasOfTuesday);
        return massasOfDay;
    }

}
