package net.unibave.designpattersnexample.builder.fastfood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Lunch {

    private List<Food> foodOutSideBox;
    private List<Food> foodInsideBox;

    private Lunch(List<Food> foodInsideBox, List<Food> foodOutSideBox){
        this.foodInsideBox = foodInsideBox;
        this.foodOutSideBox = foodOutSideBox;
    }


    public List<Food> getFoodInsideBox() {
        return foodInsideBox;
    }

    public List<Food> getFoodOutSideBox() {
        return foodOutSideBox;
    }

    public static Lunch.LunchBuilder builder(){
        return new LunchBuilder();
    }


    public static class LunchBuilder {

        private Potato potato;
        private Sandwich sandwich;
        private Soda soda;
        private Toy toy;

        public Lunch.LunchBuilder potato(Potato potato){
            this.potato = potato;
            return this;
        }

        public Lunch.LunchBuilder sandwich(Sandwich sandwich){
            this.sandwich = sandwich;
            return this;
        }

        public Lunch.LunchBuilder toy(Toy toy){
            this.toy = toy;
            return this;
        }

        public Lunch.LunchBuilder soda(Soda soda){
            this.soda = soda;
            return this;
        }

        public Lunch build(){
            return new Lunch(Arrays.asList(potato, sandwich, toy), Objects.isNull(soda) ? new ArrayList<>() : Arrays.asList(soda));
        }


    }
}
