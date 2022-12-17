package com.javarush.task.task15.task1528;

/* 
ООП. Hryvnia — тоже деньги
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Object getAmount() {
            return amount;
        }

        public Hryvnia getMoney() {
            return this;
        }
    }
}
