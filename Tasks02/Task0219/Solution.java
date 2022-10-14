import java.util.ArrayList;

/*
Двойные фигурные скобки
В методе main создается список ArrayList<String>,
присваивается переменной var strings и заполняется пятью элементами.
Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>(){{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }
}
