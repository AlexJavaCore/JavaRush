package com.javarush.task.task14.task1403;

/* 
Building и School
В этой задаче тебе нужно:
Правильно расставить наследование между Building (здание) и School (здание школы).
Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
Изменить null на объект класса Building или School.
Сигнатуры методов getSchool() и getBuilding() не меняй.
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {

        return new School();
    }

    public static Building getBuilding() {

        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building  {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
