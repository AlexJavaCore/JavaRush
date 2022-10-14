/*
Назад в прошлое
В классе Solution есть поле intArray,
геттер и сеттер для него, и метод main с объявленными в нем переменными.
Тебе нужно заменить типы переменных с var на конкретный тип объекта
(изменять названия и инициализацию объектов нельзя),
а также починить геттер и сеттер поля intArray.
*/

public class Solution {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}