package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
Перед тем, как космический корабль отправится бороздить просторы Вселенной,
необходимо пригласить на борт экипаж, который будет состоять из 2 людей, 1 собаки и 1 кота.
В методе createCrew() добавь необходимое количество экземпляров соответствующих
классов в список astronauts.

Подсказка:
Чтобы добавить объекты разных классов в один список, им нужен общий предок.
Унаследуй интересующие тебя классы от Astronaut. Кто угодно может стать исследователем космоса :)
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
