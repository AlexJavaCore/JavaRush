package com.javarush.task.task12.task1202;

/* 
Кит, коровий потомок
Переопредели метод getName в классе Whale(Кит),
чтобы программа выводила на экран пустую строку.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}
