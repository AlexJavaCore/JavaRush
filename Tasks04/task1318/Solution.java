package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
В классе Solution реализуй метод getNextMonth,
который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый.
Используй методы values и ordinal.
Метод main не участвует в проверке.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
    }
}
