package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" ћо€ страна - %s. я несу %d €иц в мес€ц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
}

