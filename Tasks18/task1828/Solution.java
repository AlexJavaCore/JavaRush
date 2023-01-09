package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
                return number1 - number2;
            }
        });
        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("end")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }
        if (outputFile == null) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}
