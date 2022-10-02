/*
Солнечная система — наш дом
Программа выводит на экран основные факты о Солнечной системе.
Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem,
но результат работы программы при этом не изменился.
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println(String.format("Ее возраст около %s лет.", SolarSystem.age));
        System.out.println(String.format("В Солнечной системе %s известных планет.", SolarSystem.planetsCount));
        System.out.println(String.format("Как и большинство звездных систем, состоит из %s звезды.",
                SolarSystem.starsCount));
        System.out.println(String.format("Звезды по имени %s.", SolarSystem.starName));
        System.out.println(String.format("Расстояние к центру галактики составляет %s световых лет.",
                SolarSystem.galacticCenterDistance));
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
