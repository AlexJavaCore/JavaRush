package com.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Две реализации одного интерфейса
В интерфейсе Runnable объявлен метод run() и есть две его реализации:
в классе Car и в классе Plane.
В классе Solution есть публичное статическое поле ArrayList<Runnable> list,
а также два публичных статических метода:
addToList(Runnable), который добавляет в список list элемент,
полученный в качестве входного параметра, и метод runList(),
который вызывает метод run() у каждого элемента списка list.
Твоя задача — реализовать эти методы.

Метод main() не участвует в тестировании.
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (var item : list) {
            item.run();
        }
    }
}
