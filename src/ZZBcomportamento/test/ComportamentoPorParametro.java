package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametro {
    private static List<Car> cars = List.of(new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterByColor(cars, "green"));
        System.out.println(filterByYear(cars, 2000));
    }

    private static List<Car> filterByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() <= year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
