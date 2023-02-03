package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarService {

    private static final List<Car> cars = Car.getFiveCars();

    public static List<Car> getCars(Integer count) {
        Stream<Car> carsStream = cars.stream()
                .limit(count == null ? cars.size() : count);
        return carsStream.toList();
    }
}
