package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if(!path.isAbsolute())
            System.out.println(path.toAbsolutePath());
        else
            System.out.println(path);
    }
}

