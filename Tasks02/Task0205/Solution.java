/*
����� �������
�������� ����� divide(double a, double b) ���,
����� � ������� ��������� ��������� ������� ����� a �� ����� b.
������ ���������� ��������� ��������:
Double.POSITIVE_INFINITY, ���� ����� ����� �� ��������� �������:
a ������������� � b ����� 0;
a ����� Double.POSITIVE_INFINITY � b >= 0 � b �� ����� Double.POSITIVE_INFINITY;
a ����� Double.NEGATIVE_INFINITY � b < 0 � b �� ����� Double.NEGATIVE_INFINITY;
Double.NEGATIVE_INFINITY, ���� ����� ����� �� ��������� �������:
a ������������� � b ����� 0;
a ����� Double.NEGATIVE_INFINITY � b >= 0 � b �� ����� Double.POSITIVE_INFINITY;
a ����� Double.POSITIVE_INFINITY � b < 0 � b �� ����� Double.NEGATIVE_INFINITY;
Double.NaN, ���� ����� ����� �� ��������� �������:
a ����� 0 � b ����� 0;
���� �� ���� �� ��������� ����� Double.NaN;
a ����� Double.POSITIVE_INFINITY � b ����� Double.POSITIVE_INFINITY;
a ����� Double.POSITIVE_INFINITY � b ����� Double.NEGATIVE_INFINITY;
a ����� Double.NEGATIVE_INFINITY � b ����� Double.POSITIVE_INFINITY;
a ����� Double.NEGATIVE_INFINITY � b ����� Double.NEGATIVE_INFINITY;
����� �������� ��������� ������� a �� b.
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        System.out.println(a/b);
    }
}
