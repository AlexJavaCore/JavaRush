package com.javarush.task.pro.task17.task1713;

/* 
Да начнется представление!
Настоящий артист должен уметь развлечь людей.
И танцы, и пение — это часть развлечения.
Перед тобой 3 интерфейса:
Dance — танцующий,
Sing — поющий,
Artist — артист.

Продумай, какая структура наследования подойдет этим интерфейсам.
Унаследуй один интерфейс от двух других.
*/

public interface Artist extends Dance, Sing {
}