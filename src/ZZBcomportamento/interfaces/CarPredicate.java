package ZZBcomportamento.interfaces;

import ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
