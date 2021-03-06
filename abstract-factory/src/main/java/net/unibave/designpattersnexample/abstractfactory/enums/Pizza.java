package net.unibave.designpattersnexample.abstractfactory.enums;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import net.unibave.designpattersnexample.abstractfactory.interfaces.Massa;

public enum Pizza implements Massa {

    CALABRESA {

        @Override
        public List<String> getIngredients() {
            return Arrays.asList("Queijo", "Tomate", "Calabresa");
        }

        @Override
        public String getFlavor() {
            return CALABRESA.toString();
        }

    },

    PRESUNTO {

        @Override
        public List<String> getIngredients() {
            return Arrays.asList("Queijo", "Tomate", "Presunto");
        }

        @Override
        public String getFlavor() {
            return PRESUNTO.toString();
        }

    };

    public static Pizza of(String flavor) {
        return Arrays.stream(values()).filter(pizza -> pizza.getFlavor().equals(flavor.toUpperCase())).findFirst().orElseThrow(NoSuchElementException::new);
    }

    public abstract List<String> getIngredients();

}
