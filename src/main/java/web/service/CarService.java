package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static final List<Car> cars = Car.getFiveCars();

    public static List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>();
        if (count < 5) {
            for (int i = 0; i < count; i++) {
                result.add(cars.get(i));
            }
        } else if (count >= 5){
            result.addAll(cars);
        }
        return result;
    }
}
