package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел
(Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (не забывай о том, что число может быть дробным);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String paramsSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] splitParams = paramsSubString.split("&");
        String objValue = null;

        StringBuilder resultBuilder = new StringBuilder();
        for (String splitParam : splitParams) {
            String[] paramAndValue = splitParam.split("=");
            resultBuilder.append(paramAndValue[0]);
            resultBuilder.append(" ");

            if (paramAndValue[0].equals("obj")) {
                objValue = paramAndValue[1];
            }
        }

        System.out.println(resultBuilder.toString().trim());

        if (objValue != null) {
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException nfe) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
