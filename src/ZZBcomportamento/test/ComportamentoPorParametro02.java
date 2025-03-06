package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametro02 {
    private static List<Car> cars = List.of(new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars  = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
           if(carPredicate.test(car)) {
               filterCar.add(car);
           }
        }
        return filterCar;
    }

    private static <T> List<T> filterGeneric(List<T> list, Predicate<T> carPredicate) {
        List<T> filter = new ArrayList<>();
        for (T element : list) {
            if(carPredicate.test(element)) {
                filter.add(element);
            }
        }
        return filter;
    }
}
