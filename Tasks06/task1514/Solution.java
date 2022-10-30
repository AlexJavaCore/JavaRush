package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
Напиши программу, которая будет считывать с клавиатуры два пути
и выводить в консоль относительный путь между первым и вторым путями,
если он существует. В противном случае выводить ничего не нужно.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception ignored) {
        }
    }
}

