package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" ��� ������ - %s. � ���� %d ��� � �����.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 9;
    }
}
