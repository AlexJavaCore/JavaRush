package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(fileName));

        List<Integer> numbers = new ArrayList<>();

        while ((scanner.hasNext())) {
            numbers.add(Integer.parseInt(scanner.next()));
        }

        numbers.stream()
                .filter(n -> n%2 ==0)
                .sorted()
                .forEach(System.out::println);

        scanner.close();
    }
}
