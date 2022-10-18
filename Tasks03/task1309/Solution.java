package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
В классе Solution объявлено поле grades типа HashMap<String, Double>,
где ключ — имя и фамилия студента, а значение - его средняя оценка.
Твоя задача — реализовать метод addStudents,
который добавит 5 студентов с их средней оценкой в коллекцию grades.
Значения можешь выбрать любые.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Дмитрий Сергеев", 3.5d);
        grades.put("Сергей Носов", 4.5d);
        grades.put("Олег Фокин", 2.2d);
        grades.put("Ольга Фокина", 3.2d);
        grades.put("Алекс Крон", 5d);
    }
}
