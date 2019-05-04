package net.unibave.designpattersnexample.chainofresponsability;

public class SecondFilter extends AbstractFilter {

    public SecondFilter() {
        super(new ThirdFilter());
    }

    @Override
    public void apply(Request request, Response response) {
        System.out.println("Second filter for request " + request.toString() + " and response " + response);
        next(request, response);
    }

}
