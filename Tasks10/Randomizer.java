package com.javarush.games.minigames.mini13;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Рандомайзер
Метод onTurn(int) вызывается каждую секунду. Тебе нужно:
получить случайное число (от 0 до 100 не включительно)
с помощью метода getRandomNumber(int) класса Game;
отобразить это число с помощью метода setCellNumber(int, int, int)
в клетке с координатами x = 1, y = 1 .
*/

public class Randomizer extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, getRandomNumber(100));
    }
}
