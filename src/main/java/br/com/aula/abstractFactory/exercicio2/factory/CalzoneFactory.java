package br.com.aula.abstractFactory.exercicio2.factory;

import br.com.aula.abstractFactory.exercicio2.enums.Calzone;

public class CalzoneFactory {

    public static Calzone create(String flavor){
        return Calzone.of(flavor);
    }

}
