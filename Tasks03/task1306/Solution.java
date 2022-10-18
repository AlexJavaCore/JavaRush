package com.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 1
В классе Solution объявлены методы: copy(ArrayList<String>,
ArrayList<String>), addAll(ArrayList<String>, String...),
replaceAll(ArrayList<String>, String, String).
Тебе нужно переписать их реализацию, используя при этом
только соответствующие методы класса Collections.
Параметр String... означает то же, что и String[],
только аргументы String можно передавать через запятую.
*/

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
