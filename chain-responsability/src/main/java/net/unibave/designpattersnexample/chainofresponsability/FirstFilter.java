package net.unibave.designpattersnexample.chainofresponsability;

public class FirstFilter extends AbstractFilter {

    public FirstFilter() {
        super(new SecondFilter());
    }

    @Override
    public void apply(Request request, Response response) {
        System.out.println("First filter for request " + request.toString() + " and response " + response);
        next(request, response);
    }

}
