package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("bmw x6", 2018, 4.4));
        cars.add(new Car("toyota caldina", 2017, 2.4));
        cars.add(new Car("mercedes benz e530 e class", 2016, 3.2));
        cars.add(new Car("range rover sport", 2019, 5.0));
        cars.add(new Car("bugatti cyron", 2018, 6.6));
        cars.add(new Car("ferrari laferrari", 2015, 4.2));
        cars.add(new Car("lexus rx 350", 2016, 3.3));
        cars.add(new Car("honda crv", 2015, 2.4));
        cars.add(new Car("daewoo ravon r 3", 2017, 2.0));
        cars.add(new Car("lamborghini veneno", 2015, 6.5));
        cars.add(new Car("bmw e60", 2009, 3.4));

        for (Car car : cars) {
            System.out.println(car.getModel() + "-модель машины ; "
                    + car.getYear() + "-год выпуска машины ; "
                    + car.getVolume() + "-объем двигателя ;");
        }
        System.out.println("_____________________________________________________________________________________");

        Collections.sort(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });

        for (Car car : cars) {
            System.out.println(car.getModel() + "-модель машины ; " + car.getYear() + "-год выпуска машины ; "
                    + car.getVolume() + "-объем двигателя ;");
        }
    }
}
