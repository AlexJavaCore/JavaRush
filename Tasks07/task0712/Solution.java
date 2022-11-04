package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
В методе convert нужно преобразовать Map в Set.
Принцип преобразования:

если в sourceMap было два таких элемента:
2018-05-31=[12:43:00.615424667, 08:35:29.212766273]
1998-01-31=[07:56:59.931458499]

то в результате в множестве должно получиться три элемента:
2018-05-31T12:43:00.615424667
2018-05-31T08:35:29.212766273
1998-01-31T07:56:59.931458499
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> temp = new HashSet<>();
        sourceMap.forEach((key, value) -> {
            for (int i = 0; i < value.size(); i++){
                temp.add(LocalDateTime.of(key, value.get(i)));
            }
        });
        return temp;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
