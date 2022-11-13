package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Простая программа
А сейчас научимся раскрашивать клетки и выводить в них текст.
Необходимо вывести слово JAVARUSH.
Для начала переопредели метод initialize() класса Game,
в котором задай размер поля (8x3).
Далее с помощью метода setCellValueEx(int, int, Color, String)
выведи слово в одну линию. Этот метод раскрашивает клетку и выводит
в ней текст по заданным координатам.
Каждая буква в линии должна быть в отдельной клетке.
Координаты первой буквы: x = 0, y = 1. Цвет клетки — оранжевый (Color.ORANGE).
*/

public class SymbolGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(8, 3);
            setCellValueEx(0, 1, Color.ORANGE, "J");
            setCellValueEx(1, 1, Color.ORANGE, "A");
            setCellValueEx(2, 1, Color.ORANGE, "V");
            setCellValueEx(3, 1, Color.ORANGE, "A");
            setCellValueEx(4, 1, Color.ORANGE, "R");
            setCellValueEx(5, 1, Color.ORANGE, "U");
            setCellValueEx(6, 1, Color.ORANGE, "S");
            setCellValueEx(7, 1, Color.ORANGE, "H");
    }
}
