/*
������ �����
�������� ������ countDigits(String), countLetters(String),
countSpaces(String), ������� ������ ���������� ���������� ����,
���� � �������� � ������. ����� main �� ��������� ������� � ��������.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "�����, ��� ����� ����� �����." +
                "������ �� �������� ������, ��� ��� �������� ��������.";

        System.out.println("���������� ���� � ������ : " + countDigits(string));
        System.out.println("���������� ���� � ������ : " + countLetters(string));
        System.out.println("���������� �������� � ������ : " + countSpaces(string));
    }

    public static int countDigits(String string) {
       int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isDigit(ch))
                num++;
        }
        return num;
    }

    public static int countLetters(String string) {
        int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isLetter(ch))
                num++;
        }
        return num;
    }

    public static int countSpaces(String string) {
        int num = 0;
        for (Character ch : string.toCharArray()) {
            if(Character.isSpaceChar(ch))
                num++;
        }
        return num;
    }
}
