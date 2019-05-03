package br.com.aula.exercicio2.factory;

import br.com.aula.exercicio2.enums.Calzone;
import br.com.aula.exercicio2.enums.Pizza;
import br.com.aula.exercicio2.interfaces.Massa;
import br.com.aula.exercicio2.model.Pizzaria;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzariaFactory {

    public static Pizzaria create(String nome){
        return Pizzaria.of(nome, getMassasOfDay());
    }

    private static Map<DayOfWeek, List<Massa>> getMassasOfDay(){
        Calzone calzonePresunto = CalzoneFactory.create("presunto");
        Calzone calzoneCalabresa = CalzoneFactory.create("calabresa");
        Pizza pizzaPresunto = PizzaFactory.create("presunto");
        Pizza pizzaCalabresa = PizzaFactory.create("calabresa");

        List<Massa> massasOfMonday = Arrays.asList(calzoneCalabresa, pizzaCalabresa);
        List<Massa> massasOfTuesday = Arrays.asList(calzonePresunto, pizzaPresunto);

        Map<DayOfWeek, List<Massa>> massasOfDay = new HashMap<>();
        massasOfDay.put(DayOfWeek.MONDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.TUESDAY, massasOfTuesday);
        massasOfDay.put(DayOfWeek.WEDNESDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.THURSDAY, massasOfTuesday);
        massasOfDay.put(DayOfWeek.FRIDAY, massasOfMonday);
        massasOfDay.put(DayOfWeek.SATURDAY, massasOfTuesday);
        return massasOfDay;
    }

}
