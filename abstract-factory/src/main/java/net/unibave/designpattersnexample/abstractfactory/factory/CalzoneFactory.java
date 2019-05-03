package net.unibave.designpattersnexample.abstractfactory.factory;

import net.unibave.designpattersnexample.abstractfactory.enums.Calzone;

public class CalzoneFactory {

    public static Calzone create(String flavor){
        return Calzone.of(flavor);
    }

}
