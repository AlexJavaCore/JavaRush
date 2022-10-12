import java.util.ArrayList;

/*
��������� �������
� 3020 ���� ������ ��������� ���������� ����� �������,
���� �� ������� ��������� � ������ �� ������ ������.
��� ������� ��������� ����� ������ � ������.
�������� ����� createNewPlanet(String), ������� ������ ���������
���������� ������� � ������ planets ����� ����� �����. ��������,
��� ��������� ������� ���������� ������.
������ main(), addPlanets() � print() �� ��������� ������� � ��������.
*/

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("������ ������");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(3, planetName);
    }

    public static void addPlanets() {
        planets.add("��������");
        planets.add("������");
        planets.add("�����");
        planets.add("����");
        planets.add("������");
        planets.add("������");
        planets.add("����");
        planets.add("������");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s � %d-� ������� �� ������", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
