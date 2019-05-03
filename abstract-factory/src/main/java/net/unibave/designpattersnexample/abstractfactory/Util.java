package net.unibave.designpattersnexample.abstractfactory;

import java.time.LocalDate;

public class Util {

    public static int intBetween(int start, int end) {
        return (int) (start + Math.round(Math.random() * (end - start)));
    }

    public static LocalDate localDateBetween(Integer yearStart, Integer yearEnd) {
        if (yearEnd == null){
            yearEnd = LocalDate.now().getYear();
        }
        if (yearStart == null){
            yearStart = LocalDate.now().getYear();
        }
        int day = intBetween(1, 28);
        int month = intBetween(1, 12);
        int year = intBetween(yearStart, yearEnd);
        return LocalDate.of(year, month, day);
    }

}
