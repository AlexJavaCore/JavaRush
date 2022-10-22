package com.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Проверка присутствия
В классе Solution есть метод checkWords(String),
который должен проверять наличие переданного слова в множестве words.
Если слово есть, то выводим в консоль:
Слово [переданное слово] есть в множестве
Если нет:
Слова [переданное слово] нет в множестве
Метод main не участвует в проверке.
Пример вывода:
Слово Java есть в множестве
*/

public class Solution {
    public static HashSet<String> words =
            new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if(words.contains(word))
            System.out.println(String.format("Слово %s есть в множестве", word));
        else
            System.out.println(String.format("Слова %s нет в множестве", word));
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
