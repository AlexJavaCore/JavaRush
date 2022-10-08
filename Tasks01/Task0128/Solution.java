/* 
��������� �����
��������� ����������� ����� � �����.
� ������ Solution ���� ����������� ����� digitToText(char),
������� ���������� ��������� ������������� ����.
� ������ main ����� ����������� � ��������� �������������,
�� ��������� ������ "������ ������ ... ".
������ � ����� digitToText(char) ������ ���������� ���������� break,
����� �� ��������� ���������� ��������� ������������� �����. ����� main �� ��������� � ��������.
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "����";
                break;
            case '1':
                result = "����";
                break;
            case '2':
                result = "���";
                break;
            case '3':
                result = "���";
                break;
            case '4':
                result = "������";
                break;
            case '5':
                result = "����";
                break;
            case '6':
                result = "�����";
                break;
            case '7':
                result = "����";
                break;
            case '8':
                result = "������";
                break;
            case '9':
                result = "������";
                break;
        }
        return result;
    }
}
