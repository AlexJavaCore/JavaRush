package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" ��� ������ - %s. � ���� %d ��� � �����.", Country.BELARUS, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 11;
    }
}

