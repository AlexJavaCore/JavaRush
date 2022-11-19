package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine())
        {
            stringBuilder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(stringBuilder.toString());

        scanner.close();
        reader.close();
    }
}