package com.javarush.task.pro.task17.task1702;

/* 
Геометрия для чайников
Классы Triangle, Rectangle и Circle — геометрические фигуры,
поэтому они и унаследованы от класса Shape.
Переопредели в них метод printInfo(),
чтобы в консоли выводилось название конкретной фигуры:
Для Triangle — "Треугольник";
Rectangle — "Прямоугольник";
Circle — "Круг".

Метод main() в тестировании участия не принимает.
*/

public class Solution {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
