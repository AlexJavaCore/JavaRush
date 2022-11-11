package com.javarush.task.pro.task18.task1820;

import java.util.Optional;
import java.util.stream.Stream;

/* 
Самый дорогой автомобиль
У автомобиля, представленного классом Car, есть две характеристики:
название - поле name, цена - поле price.
В классе Solution выполняются две операции поиска:

метод getMostExpensiveCar(Stream<Car>) ищет самый дорогой автомобиль в одном списке;
метод getMoreExpensiveCar(Stream<Car>, Car) в другом списке ищет автомобиль дороже,
чем полученный в методе getMostExpensiveCar(Stream<Car>).
Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
Подсказка:
Для поиска элемента с максимальным искомым значением в потоке данных используй метод max(),
а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй
метод findFirst().

Метод main() не принимает участие в тестировании.
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {

        return cars.max((c1, c2) -> c1.getPrice() - c2.getPrice());
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
