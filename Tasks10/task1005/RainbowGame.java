package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
Поработаем с методом setCellColor(int, int, Color),
который будет разукрашивать клетку по переданным координатам.
Приступим к отрисовке радуги. Необходимо создать игровое
поле размером 10x7 в методе initialize() и разукрасить
каждую строку разными цветами, используя метод setCellColor(int, int, Color).
Порядок сверху вниз должен быть следующим:

Color.RED
Color.ORANGE
Color.YELLOW
Color.GREEN
Color.BLUE
Color.INDIGO
Color.VIOLET
*/

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 7; y++) {
                setCellColor(x, y, colors[y]);
            }
        }
    }
}
