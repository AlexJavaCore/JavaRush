package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if(!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            if (mode.equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 32);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }
        }
    }

}
