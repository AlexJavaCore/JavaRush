package com.javarush.task.task17.task1706;

/* 
Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке.
Внутри класса OurPresident в статическом блоке создай синхронизированный блок.
Внутри синхронизированного блока инициализируй president.
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}
