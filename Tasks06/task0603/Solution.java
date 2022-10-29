package com.javarush.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Если ресурсов много
Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.
Перепиши код программы с использованием try-with-resources: вынеси в круглые скобки создание объектов
с внешними ресурсами. Не забудь удалить ненужный блок finally и вызовы метода close().
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

