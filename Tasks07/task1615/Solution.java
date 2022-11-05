package com.javarush.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой как много методов!
в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {

        return instant.plusSeconds(minutes*60);
    }

    static public Instant plusHours(Instant instant, long hours) {

        return instant.plusSeconds(hours*60*60);
    }

    static public Instant plusDays(Instant instant, long days) {

        return instant.plusSeconds(days*60*60*24);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {

        return instant.minusSeconds(minutes*60);
    }

    static public Instant minusHours(Instant instant, long hours) {

        return instant.minusSeconds(hours*60*60);
    }

    static public Instant minusDays(Instant instant, long days) {

        return instant.minusSeconds(days*60*60*24);
    }
}
