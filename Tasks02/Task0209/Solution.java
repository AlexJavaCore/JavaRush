import java.util.ArrayList;

/* 
�����������
� ������ Solution ���� ������ ����������� waitingEmployees,
������� ���� ��������, � ������ ����������� alreadyGotSalaryEmployees,
������� � ��� ��������. ���������� ����������� ����� paySalary(String),
������� � �������� ��������� ��������� ��� ����������, ��������� �������� ��������.
����� ������ ��������� ������� ���������� � ������ waitingEmployees,
� ���� �� �� ������� ��������, ������ �:
���� �������� ������ paySalary(String) ��������� null, ������ �� ����� ������.
�������� ��� ���������� � ������ alreadyGotSalaryEmployees.
� ������ waitingEmployees �������� ��� ���������� �� null.
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("������");
        waitingEmployees.add("��������");
        waitingEmployees.add("���������");
        waitingEmployees.add("������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�����");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}
