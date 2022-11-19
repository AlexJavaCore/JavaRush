package com.javarush.task.task13.task1316;

/* 
Некорректные строки
Удали все некорректные строки в интерфейсе Button.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        void onPress();

        String onPress(Object o);

    }
}