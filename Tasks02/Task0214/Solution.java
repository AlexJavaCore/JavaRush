import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
������, �������
� ������ main ����� � ����� ���� ���������������� Pascal �� ������ programmingLanguages.
*/

public class Solution {
    public static ArrayList<String> programmingLanguages
            = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
    }
}
