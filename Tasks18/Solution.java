package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
В метод main первым параметром приходит путь к файлу.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой до ближайшего.
4. Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readedChar = fileReader.read();
                total++;
                if (readedChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}
