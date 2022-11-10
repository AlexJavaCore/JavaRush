package com.javarush.task.pro.task18.task1809;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощание со ссылками на методы
В классе Solution публичный метод print(ArrayList<Integer>)
выводит в консоли все элементы списка по порядку.
Сейчас метод реализован с использованием метода списка forEach(),
который принимает ссылку на метод. Необходимо переписать реализацию
метода print(ArrayList<Integer>), чтобы метод списка forEach()
вместо ссылки на метод принимал лямбда-выражения.

Метод main() не принимает участие в тестировании.
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(number -> System.out.println(number));
    }
}
