package net.unibave.designpattersnexample.chainofresponsability;

public class Runner {

    public static void main(String[] args) {
        AbstractFilter.first(
                Request.of("request foo", "request bar"),
                Response.of("response foo", "response bar")
        );
    }

}
