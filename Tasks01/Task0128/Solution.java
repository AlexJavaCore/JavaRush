/* 
Текстовые цифры
Программа преобразует цифры в текст.
В классе Solution есть статический метод digitToText(char),
который возвращает текстовое представление цифр.
В методе main число переводится в текстовое представление,
но выводится только "девять девять ... ".
Добавь в метод digitToText(char) нужное количество операторов break,
чтобы он возвращал правильное текстовое представление цифры. Метод main не участвует в проверке.
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
                break;
            case '1':
                result = "один";
                break;
            case '2':
                result = "два";
                break;
            case '3':
                result = "три";
                break;
            case '4':
                result = "четыре";
                break;
            case '5':
                result = "пять";
                break;
            case '6':
                result = "шесть";
                break;
            case '7':
                result = "семь";
                break;
            case '8':
                result = "восемь";
                break;
            case '9':
                result = "девять";
                break;
        }
        return result;
    }
}
