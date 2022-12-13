package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
Создай 4 конструктора с разными модификаторами доступа в классе Solution.
В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось
3 разных (все, кроме private).
*/

public class Solution {

    private Solution() {}
    public Solution(int n) {}
    protected Solution (String s) {}
    Solution (double d) {}

    public static void main(String[] args) {
    }
}

