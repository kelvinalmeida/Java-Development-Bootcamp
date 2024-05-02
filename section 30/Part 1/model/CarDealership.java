package model;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {

    List<Car> cars;


    public CarDealership() {
        cars = new ArrayList<>();
    }

    public Car getCar(int index) {
        return new Car(cars.get(index));
    }

    public void setCar(Car car, int index) {
        cars.set(index, new Car(car));
    }

    public void addCar(Car car) {
        cars.add(new Car(car));
    }
}