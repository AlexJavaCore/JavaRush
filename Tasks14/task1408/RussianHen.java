package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" ��� ������ - %s. � ���� %d ��� � �����.", Country.RUSSIA, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }
}


