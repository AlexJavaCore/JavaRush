package com.javarush.task.pro.task18.task1815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Преобразование данных
У учетной записи (класс Account) есть имя (поле name) и электронный ящик (поле email).
Нужно, чтобы метод getEmails(ArrayList<Account>) в классе Solution возвращал
поток электронных ящиков всех учетных записей из списка,
полученного в качестве входящего аргумента.

Подсказка:
Для преобразования потока данных одного типа в другой используй метод map()
объекта типа Stream<Account>.

Метод main() не принимает участие в тестировании.
*/

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        return accounts.stream().map(Account::getEmail);
    }
}
