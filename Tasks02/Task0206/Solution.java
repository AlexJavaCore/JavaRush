/*
Анализ строк
Реализуй методы countDigits(String), countLetters(String),
countSpaces(String), которые должны возвращать количество цифр,
букв и пробелов в строке. Метод main не принимает участия в проверке.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
       int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isDigit(ch))
                num++;
        }
        return num;
    }

    public static int countLetters(String string) {
        int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isLetter(ch))
                num++;
        }
        return num;
    }

    public static int countSpaces(String string) {
        int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isSpaceChar(ch))
                num++;
        }
        return num;
    }
}
