package net.unibave.designpattersnexample.abstractfactory;

class LogFactory {

    static Log create(){
        return (Util.intBetween(0, 10) % 2 == 0) ? new LogFile() : new LogConsole();
    }

}
