package br.com.aula.exercicio2.enums;

import br.com.aula.exercicio2.interfaces.Massa;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public enum Calzone implements Massa {
    CALABRESA{
        @Override
        public List<String> getIngredients() {
            return Arrays.asList("Queijo", "Tomate", "Calabresa");
        }

        @Override
        public String getFlavor() {
            return CALABRESA.toString();
        }
    },
    PRESUNTO{
        @Override
        public List<String> getIngredients() {
            return Arrays.asList("Queijo", "Tomate", "Presunto");
        }

        @Override
        public String getFlavor() {
            return PRESUNTO.toString();
        }
    };
    public abstract List<String> getIngredients();

    public static Calzone of(String flavor){
        return Arrays.stream(values()).filter(calzone -> calzone.getFlavor().equals(flavor.toUpperCase())).findFirst().orElseThrow(NoSuchElementException::new);
    }
}
