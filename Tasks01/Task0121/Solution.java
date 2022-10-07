
import java.util.Arrays;

/*
Забытая инициализация
В программе массив заполняется числами от 0 до 9 и выводится на экран. Но из-за ошибки программа не компилируется.
Сделай так, чтобы программа компилировалась и работала правильно.
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
