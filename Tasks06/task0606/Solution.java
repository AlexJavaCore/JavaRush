package com.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
Напиши программу, которая считывает из консоли имя текстового файла,
далее читает символы из этого файла (используй метод readAllLines(Path) класса Files)
и выводит на экран все, за исключением точки, запятой и пробела.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',')
                        System.out.print(character);
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

