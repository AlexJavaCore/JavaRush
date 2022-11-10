package com.javarush.task.pro.task18.task1816;

import java.util.stream.Stream;

/* 
Преобразование данных-2
Реализуй метод toUpperCase(Stream<String>) так,
чтобы он возвращал поток таких же строк, что и во входящем потоке,
только в верхнем регистре.
Поскольку это будет поток уже других строк,
для преобразования используй метод map() объекта типа Stream<String>.

Метод main() не принимает участие в тестировании.
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {

        return strings.map(String::toUpperCase);
    }
}
