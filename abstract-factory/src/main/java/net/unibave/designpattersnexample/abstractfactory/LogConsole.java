package net.unibave.designpattersnexample.abstractfactory;

class LogConsole implements Log {

    @Override
    public void print(String string) {
        System.out.println(string);
    }

}
