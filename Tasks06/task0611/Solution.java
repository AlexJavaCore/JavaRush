package com.javarush.task.pro.task15.task1511;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем символы в файл
Есть программа, которая считывает из консоли путь к файлу и записывает
в этот файл последовательность символов, полученную из аргумента метода main(String[]).
Твоя задача — исправить ошибку, чтобы массив символов можно было записать в файл.
Для записи символов в файл нужно использовать объект BufferedWriter, полученный
в результате вызова метода newBufferedWriter(Path) класса Files.
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
             bufferedWriter.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}


