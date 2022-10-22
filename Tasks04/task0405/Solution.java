package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:
removeBugWithFor(ArrayList<String>) - должен удалить строку из списка,
если она содержит слово bug, используя цикл for и счетчик.
removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка,
если она содержит слово bug, используя цикл while и метод iterator().
removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка,
если она содержит слово bug, используя цикл for-each и копию списка.
В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
Метод main реализован для вашего кода и не участвует в проверке.
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase("bug"))
            {
                list.remove(list.get(i));
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("bug"))
                iterator.remove();
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String word : listCopy) {
            if(word.equalsIgnoreCase("bug"))
                list.remove(word);
        }
    }
}
