/* 
��������� ��������
����� compare(Character, Character) ��������� ��� �������,
������� � ������� ��������� �� ���������.
�������� ����� compare(Character, Character),
������� ������ ��������� ���������� �������.
���� ��� ������� ������� ������ �������, ������� "������".
���� ��� ������� ������� ������ �������, ������� "������".
���� ��� ������� ������� ����� �������, ������� "�����".
*/

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', '�');
        compare('�', '�');
        compare('�', '�');
    }

    public static void compare(Character first, Character second) {
        if (first.charValue() == second.charValue()) {
            System.out.println("�����");
        } else if (first > second) {
            System.out.println("������");
        } else if (first < second) {
            System.out.println("������");
        } else {
            System.out.println("� ��� ����� ����� ����???");
        }
    }
}