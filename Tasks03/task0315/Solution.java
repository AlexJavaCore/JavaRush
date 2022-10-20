package com.javarush.task.pro.task13.task1313;

/* 
StringsLinkedList
Пришло время познакомиться с двусвязным списком.
Решая эту задачу ты поймешь, как работает двусвязный список
и сможешь добавлять в него элементы. У тебя есть класс StringsLinkedList,
в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.

Подсказки:
Для правильной реализации важно понимать,
что по списку можно проходить как с первого элемента до последнего,
так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
Метод add должен создавать новый объект класса Node,
в который он поместит переданное значение.
Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную,
а новосозданная станет последней.
Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
Метод printAll создан для debug и в проверке не участвует.
Важно:
Node first не должна иметь значение, она указывает только на первый элемент(first.next);
Node last также не содержит значения, а только указывает на последний элемент(last.prev).
*/

public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        stringsLinkedList.printAll();
    }
}
