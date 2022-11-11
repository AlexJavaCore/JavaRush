package com.javarush.task.pro.task18.task1823;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/* 
Из потока данных во множество
Необходимо, чтобы метод getFilteredStrings(Stream<String>)
преобразовывал входящий поток строк во множество строк,
длина которых больше шести символов.
Реализуй его, используя метод collect() объекта типа Stream<String>.
В качестве параметра передай нужный коллектор (объект типа Collector<Set<String>>).
Такой объект можно получить, вызвав статический метод toSet() класса Collectors.

Метод main() не принимает участие в тестировании.
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {

        return stringStream.filter(s -> s.length() > 6).collect(toSet());
    }
}
