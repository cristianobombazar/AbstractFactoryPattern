package net.unibave.designpattersnexample.chainofresponsability;

public final class Response {

    private final String foo;
    private final String bar;

    private Response(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public static Response of(String foo, String bar) {
        return new Response(foo, bar);
    }

    @Override
    public String toString() {
        return foo + " - " + bar;
    }

}
