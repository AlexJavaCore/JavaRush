package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
MovieFactory
У нас есть кинофабрика, но она работает не в полную силу.
Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
Вот что тебе нужно сделать для успешного решения:
Разобраться, что программа умеет делать.
Все классы должны быть внутри класса Solution.
Добавить классы Cartoon, Thriller.
Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

Создать переменную movie типа Movie и для каждой введенной строки (ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
вывести на экран movie.getClass().getSimpleName().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String key;
        Movie movie;

        while (true) {
            key = scanner.nextLine();
            boolean u = key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera");
            movie = MovieFactory.getMovie(key);
            if (!u) break;
            System.out.println(movie.getClass().getSimpleName());
        }
    }

static class MovieFactory {

    static Movie getMovie(String key) {
        Movie movie = null;

        if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
        }

        if ("cartoon".equals(key)) {
            movie = new Cartoon();
        }

        if ("thriller".equals(key)) {
            movie = new Thriller();
        }

        return movie;
    }
}

static abstract class Movie {
}

static class SoapOpera extends Movie {
}

static class Cartoon extends Movie {
}

static class Thriller extends Movie {
}
}
