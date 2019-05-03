package net.unibave.designpattersnexample.singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental.getInstance().increment();
            System.out.println(Incremental.getInstance().toString());
        }
    }

}
