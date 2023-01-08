package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать
в первый файл содержимое третьего файла.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String nameFile1 = scanner.nextLine();
        String nameFile2 = scanner.nextLine();
        String nameFile3 = scanner.nextLine();

        try (FileOutputStream fileOutputStream = new FileOutputStream(nameFile1);
            FileInputStream fileInputStream1 = new FileInputStream(nameFile2);
             FileInputStream fileInputStream2 = new FileInputStream(nameFile3)) {
            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }
    }
}
