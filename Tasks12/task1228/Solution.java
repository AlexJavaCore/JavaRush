package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
Добавь как можно больше интерфейсов к классу Human,
но так, чтобы он не стал абстрактным классом.
Добавлять методы в класс Human запрещается.
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman, Worker, Secretary{

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
