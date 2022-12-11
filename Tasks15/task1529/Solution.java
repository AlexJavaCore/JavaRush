package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
В этой задаче тебе нужно:
Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
В статическом методе reset() класса Solution:
считать с консоли параметр типа String;
если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту
CanFly result присвоить объект класса Plane.
В статическом блоке инициализировать CanFly result, вызвав метод reset().
Закрыть поток ввода методом close().
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("helicopter"))
            result = new Helicopter();
        if(s.equals("plane"))
            result = new Plane(scanner.nextInt());
        scanner.close();
    }
}
