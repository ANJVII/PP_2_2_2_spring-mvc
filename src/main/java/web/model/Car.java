package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int series;
    private int price;

    public Car() {
    }

    public static List<Car> getFiveCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 8347, 1_000_000));
        cars.add(new Car("BMW", 2873, 950_000));
        cars.add(new Car("Ford", 3287, 1_500_000));
        cars.add(new Car("Kia", 8374, 1_400_000));
        cars.add(new Car("Lada", 3472, 200_000));
        return cars;
    }

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", price=" + price +
                '}';
    }
}
