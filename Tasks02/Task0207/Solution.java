/*
����� ����� ������
��������� ���������� ��� �����. ���� ������ ����� ������ �������, �� � ������� ��������� ���������: ������ ����� ������ �������.
���� ������ ����� ������ ������� ��� ����� ������� �����, �� � ������� ��������� ���������: ������ ����� ������ ��� ����� ������� �����.
�� �� ������ ������ ��������� ����������� � �������. ���������, ��� �������� �� ��� � ������� ������.
����� main �� ��������� ������� � ��������
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("������ ����� ������ �������");
        } else {
            System.out.println("������ ����� ������ ��� ����� ������� �����");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }
}
