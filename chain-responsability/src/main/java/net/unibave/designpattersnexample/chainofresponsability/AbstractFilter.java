package net.unibave.designpattersnexample.chainofresponsability;

import java.util.Objects;

public abstract class AbstractFilter {

    private AbstractFilter nextFilter;

    public AbstractFilter() {
    }

    public AbstractFilter(AbstractFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public void next(Request request, Response response) {
        if (Objects.nonNull(this.nextFilter)) {
            this.nextFilter.apply(request, response);
        }
    }

    public abstract void apply(Request request, Response response);

    public static void first(Request request, Response response) {
        new FirstFilter().apply(request, response);
    }

}
