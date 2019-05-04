package net.unibave.designpattersnexample.chainofresponsability;

public class FourthFilter extends AbstractFilter {

    @Override
    public void apply(Request request, Response response) {
        System.out.println("Fourth filter for request " + request.toString() + " and response " + response);
        next(request, response);
    }

}
