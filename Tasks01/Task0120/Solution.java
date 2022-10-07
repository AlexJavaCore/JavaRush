import java.util.Scanner;

/*
Все буквы маленькие
Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
Исправь ошибку в коде, чтобы программа работала корректно.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        System.out.println(line.toLowerCase());
    }
}
