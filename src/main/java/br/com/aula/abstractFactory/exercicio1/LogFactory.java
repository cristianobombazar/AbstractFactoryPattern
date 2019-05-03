package br.com.aula.abstractFactory.exercicio1;

import br.com.aula.Util;
import br.com.aula.abstractFactory.exercicio1.interfaces.Log;

class LogFactory {
    static Log create(){
        return (Util.intBetween(0, 10) % 2 == 0) ? new LogFile() : new LogConsole();
    }
}
