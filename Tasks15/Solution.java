package com.javarush.task.task15.task1525;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
Для решения этой задачи:
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными,
который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все
строки и добавь их по отдельности в List lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try(BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
            lines.add(line);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
