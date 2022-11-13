package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
Пришло время реализовать методы, которые вызываются при нажатии клавиш.
Это onKeyPress(Key) и onKeyReleased(Key).
При запуске игры поле состоит из 3x3 клеток.

Тебе нужно сделать так, чтобы:
при нажатии клавиши Key.LEFT закрашивались три левые клетки;
при нажатии Key.RIGHT закрашивались три правые клетки;
при нажатии Key.UP — три верхние;
при нажатии Key.DOWN — три нижние.
Клетки должны закрашиваться в зеленый цвет.
При отпускании любой из этих четырех клавиш все клетки должны закрашиваться в белый.
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            setCellColor(0, 0, Color.GREEN);
            setCellColor(0, 1, Color.GREEN);
            setCellColor(0, 2, Color.GREEN);
        } else if (key == Key.RIGHT) {
            setCellColor(2, 0, Color.GREEN);
            setCellColor(2, 1, Color.GREEN);
            setCellColor(2, 2, Color.GREEN);
        } else if (key == Key.UP) {
            setCellColor(0, 0, Color.GREEN);
            setCellColor(1, 0, Color.GREEN);
            setCellColor(2, 0, Color.GREEN);
        } else if (key == Key.DOWN) {
            setCellColor(0, 2, Color.GREEN);
            setCellColor(1, 2, Color.GREEN);
            setCellColor(2, 2, Color.GREEN);
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if(key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }
        }
    }
}
