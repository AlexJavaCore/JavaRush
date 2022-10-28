package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
В методе main перехвати исключение и выведи его стектрейс.
*/

public class Solution {

    public static void main(String[] args) {
        try{
        dangerousMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
