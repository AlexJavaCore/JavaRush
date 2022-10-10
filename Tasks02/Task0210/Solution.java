import java.util.ArrayList;

/* 
Переворачивание данных
Ты видишь рабочую программу, в которой массив int[] numbers
заполняется числами в методе init(). Затем в методе reverse()
происходит перестановка чисел в обратном порядке.
Твоя задача — переписать код так, чтобы вместо массива int[] numbers
использовался список ArrayList<Integer> numbers.
Название методов и переменных не изменяй.
Методы main() и print() не принимают участие в проверке.
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
