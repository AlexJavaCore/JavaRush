package com.javarush.task.task13.task1312;

/* 
Код сам не исправится
Исправь код так, чтобы программа выполнялась и выводила фразу:
"Я переводчик с английского".
Метод main менять нельзя!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }


}