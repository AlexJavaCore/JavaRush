package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
Создай класс StringObject и реализуй в нем интерфейс SimpleObject с параметром типа String.
Программа должна компилироваться.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
