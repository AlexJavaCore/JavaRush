package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
Инициализируй шесть статических переменных:

в timeMax запиши максимально возможное время;
в timeMin запиши минимально возможное время;
в time1 запиши время 14 часов ровно;
в time2 запиши время 7 часов 8 секунд;
в time3 запиши время 0 часов 45 минут 61 наносекунда;
в time4 запиши время 14 часов 45 секунд 1001 наносекунда.
В методе main() создай объект LocalTime, используя часы из time1 (time1.getHour()),
минуты из time2, секунды из time3, наносекунды из time4. Выведи его в консоль.
*/

public class Solution {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45, 0,61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(time1.getHour(), time2.getMinute(),
                time3.getSecond(), time4.getNano());
        System.out.println(localTime);
    }
}
