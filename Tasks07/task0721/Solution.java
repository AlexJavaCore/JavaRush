package com.javarush.task.pro.task16.task1621;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Напиши шаблон
Инициализируй статическую переменную dateTimeFormatter.
Подумай, какой шаблон ей задать, чтобы можно было распарсить строку timeString.
В методе main создай объект LocalDateTime,
используя строку timeString и твой шаблон dateTimeFormatter.
*/

public class Solution {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);
        System.out.println(dateTime);
    }
}
