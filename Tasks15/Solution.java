package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
Для решения этой задачи тебе нужно:
Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
Реализовать интерфейс Planet в классах Sun, Moon, Earth.
В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
для этого считай с консоли один параметр типа String.
если он равен одной из констант интерфейса Planet,
создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals(Planet.SUN))
            thePlanet = Sun.getInstance();
        else if(s.equals(Planet.MOON))
            thePlanet = Moon.getInstance();
        else if(s.equals(Planet.EARTH))
            thePlanet = Earth.getInstance();
        else
            thePlanet = null;
        scanner.close();
    }
}
