package com.javarush.task.pro.task13.task1322;

/*
Типы многоугольников
В классе Solution есть метод getShapeNameByCountOfCorners(int),
который возвращает название многоугольника в зависимости от количества углов.
Твоя задача — переписать метод, используя только оператор switch.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner)
        {
            case 3:  shape = "Треугольник"; break;
            case 4:  shape = "Четырехугольник"; break;
            case 5:  shape = "Пятиугольник"; break;
            case 6:  shape = "Шестиугольник"; break;
            case 7:  shape = "Семиугольник"; break;
            case 8:  shape = "Восьмиугольник"; break;
            default: shape = "Другая фигура";
        }

        return shape;
    }
}
