package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал
русское название дня недели аргумента date.
*/

public class Solution {

    static Date birthDate  = new Date(89, 04, 31);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        Integer day = date.getDay();
        String dayRu = "";
        switch (day){
            case 1 : dayRu = "Понедельник"; break;
            case 2 : dayRu = "Вторник"; break;
            case 3 : dayRu = "Среда"; break;
            case 4 : dayRu = "Четверг"; break;
            case 5 : dayRu = "Пятница"; break;
            case 6 : dayRu = "Суббота"; break;
            case 0 : dayRu = "Воскресенье"; break;
        }
        return dayRu;
    }
}
