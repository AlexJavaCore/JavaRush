/*
Конвертер строки
В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
Затем округли полученное значение, используя статический метод round класса Math.
Результат выведи на экран.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        System.out.println(Math.round(Double.parseDouble(string)));
    }
}

