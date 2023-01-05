package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileInputName = reader.readLine();
        String fileOutputName = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileInputName);
             FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0)
            {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes){
                fileOutputStream.write(aByte);
            }
        }
    }
}
