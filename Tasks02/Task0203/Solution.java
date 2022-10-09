/* 
—равнение чисел
¬ классе Solution есть три пол€ с одинаковыми значени€ми.
¬ методе main происходит их сравнение с выводом результата в консоли.
ƒобавь использование метода equals() в методе main такое минимальное количество раз,
чтобы вывод был:
true
true
true
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(third == first);
    }
}