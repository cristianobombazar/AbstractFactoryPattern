package net.unibave.designpattersnexample.chainofresponsability;

public final class Request {

    private final String foo;
    private final String bar;

    private Request(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public static Request of(String foo, String bar) {
        return new Request(foo, bar);
    }

    @Override
    public String toString() {
        return foo + " - " + bar;
    }

}
