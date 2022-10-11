/*
Создаем свой список
ArrayList — это список, который хранит динамически расширяемый массив элементов.
Сейчас мы будем реализовывать свою версию списка, в котором хранятся строки.
В классе CustomStringArrayList есть три поля:
String[] elements — это массив текущих элементов (в похожем массиве хранит значения ArrayList).
Изначально его размер равен 10 (capacity = 10).
int size — в нем хранится количество заполненных элементов, начальное значение — 0.
int capacity — вместимость в текущем массиве (elements) данных,
которая будет увеличиваться по ходу добавления данных.
Для простоты реализации у нас будут только два метода:

Публичный метод add(String), добавляющий элементы в массив, с помощью которого мы сможем увидеть,
как массив динамически расширяется.
Когда массив заполнен (size == capacity), вызывается метод grow() для расширения массива.
Приватный метод grow(), который должен присвоить полю elements новый массив
вместимостью (capacity) в полтора раза больше, чем у старого массива и скопировать
данные из старого массива в новый в том же порядке. Поле capacity должно увеличиться
точно так же, как и размер массива.
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity += capacity/2;
        String[] temp = new String[capacity];
        temp = elements;
        elements = new String[capacity];

        for (int i = 0; i < temp.length; i++)
            elements[i] = temp[i];
    }
}
