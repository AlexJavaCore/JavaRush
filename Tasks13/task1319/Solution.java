package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Писатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<String> strings = new ArrayList<>();

        String temp = "";

        while (true) {
            temp = reader.readLine();
                strings.add(temp);

            if(temp.equals("exit"))
                break;
            }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String s : strings ) {
            writer.write(s + "\n");
        }

        writer.close();
        reader.close();
    }
}
