package com.javarush.task.task15.task1518;

/* 
Статики и котики
Создать класс Cat с публичным полем name типа String в классе Solution.
В статическом блоке создать объект типа Cat и инициализировать
им переменную cat (не забудь инициализировать поле name).
В статическом блоке вывести имя созданного кота на экран.
Примечание: не создавай конструкторы с параметрами в классе Cat.
*/

public class Solution {
    public static Cat cat;

   public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Tom";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
