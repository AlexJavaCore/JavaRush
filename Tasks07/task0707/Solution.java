package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* 
Освоение нового API
В классе Solution реализуй 4 метода:
метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate currentDate = LocalDate.now();

        return currentDate;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, 9, 12);

        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(2020, 256);

        return date;
    }

    static LocalDate ofEpochDayExample() {
        long daysDiff = ChronoUnit.DAYS.between(LocalDate.ofEpochDay(0),
                        LocalDate.of(2020, 9, 12));
        LocalDate date = LocalDate.ofEpochDay(daysDiff);

        return date;
    }
}
