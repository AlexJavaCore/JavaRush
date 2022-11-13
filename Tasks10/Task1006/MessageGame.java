package com.javarush.games.minigames.mini06;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Диалоговые окна
Реализуем отображение диалогового окна с текстом.
По нажатию левой кнопки мыши выводим текст "Вы выиграли" зеленым цветом,
а по нажатию правой кнопки мыши — "Вы проиграли" красным цветом.

Чтобы работать с нажатиями кнопок мыши, нужно переопределить методы onMouseLeftClick(int, int)
и onMouseRightClick(int, int).
Для вывода диалогового окна используй метод showMessageDialog(Color, String, Color, int) класса Game.
Цвет фона может быть любой.
*/

public class MessageGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        showMessageDialog(Color.WHITE, "Вы выиграли", Color.GREEN, 80);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        showMessageDialog(Color.WHITE, "Вы проиграли", Color.RED, 80);
    }
}
