package com.javarush.games.minigames.mini11;

import com.javarush.engine.cell.Color;

/* 
Закрашиваем поле
Перед тобой класс FillGame. В методе initialize() задается поле размером 5x5
и вызывается метод fill(), который закрашивает все клетки в белый цвет.
Тебе нужно в классе FillOrangeGame переопределить метод fill(),
который должен будет закрашивать всё поле в оранжевый цвет.
*/

public class FillOrangeGame extends FillGame {

    @Override
    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
}
