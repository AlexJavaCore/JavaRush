package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
В этой задаче тебе предстоит создать универсальный инструмент
для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(),
которые в качестве аргументов принимают целочисленные (тип int) значения и
возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя,
тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.
*/

import java.util.Arrays;
import java.util.Collections;

public class MinMaxUtil {

    public static int min(int a, int b) {
        int[] min = new int[]{a, b};
        return Arrays.stream(min).min().getAsInt();
    }

    public static int min(int a, int b, int c) {
        int[] min = new int[]{a, b, c};
        return Arrays.stream(min).min().getAsInt();
    }

    public static int min(int a, int b, int c, int d) {
        int[] min = new int[]{a, b, c, d};
        return Arrays.stream(min).min().getAsInt();
    }

    public static int min(int a, int b, int c, int d, int f) {
        int[] min = new int[]{a, b, c, d, f};
        return Arrays.stream(min).min().getAsInt();
    }

    public static int max(int a, int b) {
        int[] max = new int[]{a, b};
        return Arrays.stream(max).max().getAsInt();
    }

    public static int max(int a, int b, int c) {
        int[] max = new int[]{a, b, c};
        return Arrays.stream(max).max().getAsInt();
    }

    public static int max(int a, int b, int c, int d) {
        int[] max = new int[]{a, b, c, d};
        return Arrays.stream(max).max().getAsInt();
    }

    public static int max(int a, int b, int c, int d, int f) {
        int[] max = new int[]{a, b, c, d, f};
        return Arrays.stream(max).max().getAsInt();
    }

}
