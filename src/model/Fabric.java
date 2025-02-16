package model;

import java.util.ArrayList;

public class Fabric {
    // Lista de carros na fábrica
    private ArrayList<Car> cars = new ArrayList<>();

    // Adiciona um carro à lista
    public void addCar(Car car) {
        cars.add(car);
    }

    // Remove um carro da lista pelo índice
    public void removeCar(int index) {
        cars.remove(index);
    }

    // Retorna a lista de carros
    public ArrayList<Car> getCars() {
        return cars;
    }
}