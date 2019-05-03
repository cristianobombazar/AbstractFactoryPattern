package br.com.aula.exercicio1;

import br.com.aula.Util;
import br.com.aula.exercicio1.interfaces.Log;

public class LogFactory {
    public static Log create(){
        return (Util.intBetween(0, 10) % 2 == 0) ? new LogFile() : new LogConsole();
    }
}
