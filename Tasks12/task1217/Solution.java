package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void Fly();
    }

    public interface CanRun {
        void Run();
    }

    public interface CanSwim {
        void Swim();
    }
}
