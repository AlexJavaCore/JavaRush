package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
В enum Month добавь 4 метода:
getWinterMonths(),
getSpringMonths(),
getSummerMonths(),
getAutumnMonths()
которые будут возвращать массив с тремя месяцами.
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] months = new Month[]{Month.values()[0], Month.values()[1], Month.values()[11]};
        return months;
    }

    public static Month[] getSpringMonths() {
        Month[] months = new Month[]{Month.values()[2], Month.values()[3], Month.values()[4]};
        return months;
    }

    public static Month[] getSummerMonths() {
        Month[] months = new Month[]{Month.values()[5], Month.values()[6], Month.values()[7]};
        return months;
    }

    public static Month[] getAutumnMonths() {
        Month[] months = new Month[]{Month.values()[8], Month.values()[9], Month.values()[10]};
        return months;
    }
}


