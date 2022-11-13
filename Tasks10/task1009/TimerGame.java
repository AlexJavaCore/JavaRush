package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
В методе initialize() устанавливается размер поля 3x3 и таймер
на обновление поля каждую секунду (1 кадр в секунду).
Тебе нужно переопределить и реализовать метод onTurn(int),
который должен посреди поля (x = 1, y = 1) выводить переменную step.
Если step четная, то закрашивать всё поле в зеленый цвет, иначе — в оранжевый.
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, step);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, step % 2 == 0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }
}
