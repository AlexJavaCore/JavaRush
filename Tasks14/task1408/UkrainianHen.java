package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" ��� ������ - %s. � ���� %d ��� � �����.", Country.UKRAINE, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
}

