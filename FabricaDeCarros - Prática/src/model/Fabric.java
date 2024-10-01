package model;

import java.util.ArrayList;

public class Fabric {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int index) {
        cars.remove(index);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
