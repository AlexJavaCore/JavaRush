package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
В этой задаче необходимо развернуть вывод в обратном порядке с помощью PrintStream.
Метод printSomething(String) выводит в поле stream переданную строку.
Необходимо развернуть вывод в обратном порядке с помощью PrintStream.
В методе main(String[] args) считывается строка с клавиатуры и передается
в метод printSomething(String), который записывает полученную строку в поток stream.
Твоя задача — в методе main(String[]) развернуть переданную строку
с помощью поля outputStream (то есть, outputStream должен хранить
в себе перевернутую строку) и вывести в консоли.

Пример:
Входные данные:
it's a text for testing
Вывод:
gnitset rof txet a s'ti

Метод printSomething(String) не изменяй.
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverse = stringBuilder.reverse().toString();
        printSomething(reverse);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
