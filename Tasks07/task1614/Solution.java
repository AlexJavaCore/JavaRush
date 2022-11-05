package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
в методе getMaxFromMilliseconds верни максимальный Instant,
который можно получить с помощью метода ofEpochMilli(long milliseconds);
в методе getMaxFromSeconds верни максимальный Instant,
который можно получить с помощью метода ofEpochSecond(long seconds);
в методе getMaxFromSecondsAndNanos верни максимальный Instant,
который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant timestamp = Instant.ofEpochMilli(Long.MAX_VALUE);

        return timestamp;
    }

    static Instant getMaxFromSeconds() {
        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());

        return timestamp;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);

        return timestamp;
    }
}
