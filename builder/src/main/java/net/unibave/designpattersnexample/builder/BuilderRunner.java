package net.unibave.designpattersnexample.builder;

import net.unibave.designpattersnexample.builder.contact.Client;
import net.unibave.designpattersnexample.builder.contact.ContactFull;
import net.unibave.designpattersnexample.builder.contact.ContactInternet;
import net.unibave.designpattersnexample.builder.contact.ContactPhone;
import net.unibave.designpattersnexample.builder.fastfood.*;

public class BuilderRunner {

    public static void main(String[] args) {
        ContactInternet contactInternet = Client.builder()
                                                .name("Cristiano")
                                                .email("cristiaano.bombazar@gmail.com")
                                                .buildContactInternet();
        ContactPhone contactPhone = Client.builder()
                                          .name("Cristiano")
                                          .phone("(+55 48 9 96779763")
                                          .buildContactPhone();
        ContactFull contactFull = Client.builder()
                                        .name("Cristiano")
                                        .email("cristiaano.bombazar@gmail.com")
                                        .phone("(+55 48 9 96779763")
                                        .address("Rua Jaco Martins de Souza, 69. São Basilio, Braço do Norte, Santa Catarina, Brazil")
                                        .buildContactFull();

        System.out.println(contactInternet.toString());
        System.out.println(contactPhone.toString());
        System.out.println(contactFull.toString());


        Lunch lunch = Lunch.builder().potato(Potato.BIG).sandwich(Sandwich.CHEESBURGUER).toy(Toy.CAR).build();
        System.out.println("Foods inside the box");
        lunch.getFoodInsideBox().forEach(System.out::println);
        System.out.println("Foods outside the box");
        lunch.getFoodOutSideBox().forEach(System.out::println);

    }
}
