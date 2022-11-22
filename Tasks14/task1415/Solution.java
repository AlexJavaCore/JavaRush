package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
В этой задаче тебе нужно:
Реализовать метод cleanAllApartments().
Пройтись по списку объектов apartments:
для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
Использовать instanceof.
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        apartments.forEach( x -> {
            if(x instanceof OneRoomApt)
                ((OneRoomApt) x).clean1Room();
            if(x instanceof TwoRoomApt)
                ((TwoRoomApt) x).clean2Rooms();
            if(x instanceof ThreeRoomApt)
                ((ThreeRoomApt) x).clean3Rooms();
        });
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
