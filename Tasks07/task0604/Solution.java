package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
Проинициализируй переменную birthDate объектом GregorianCalendar
с датой своего рождения. Реализуй метод getDayOfWeek(Calendar calendar),
чтобы он возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1989, 04, 31);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String dayOfWeek = "";
        switch (calendar.get(Calendar.DAY_OF_WEEK))
        {
            case Calendar.SUNDAY : dayOfWeek = "Воскресенье"; break;
            case Calendar.MONDAY : dayOfWeek = "Понедельник"; break;
            case Calendar.TUESDAY : dayOfWeek = "Вторник"; break;
            case Calendar.WEDNESDAY : dayOfWeek = "Среда"; break;
            case Calendar.THURSDAY : dayOfWeek = "Четверг"; break;
            case Calendar.FRIDAY : dayOfWeek = "Пятница"; break;
            case Calendar.SATURDAY : dayOfWeek = "Суббота"; break;
        }

        return dayOfWeek;
    }
}
