package net.unibave.designpattersnexample.chainofresponsability;

public class ThirdFilter extends AbstractFilter {

    public ThirdFilter() {
        super(new FourthFilter());
    }

    @Override
    public void apply(Request request, Response response) {
        System.out.println("Third filter for request " + request.toString() + " and response " + response);
        next(request, response);
    }

}
