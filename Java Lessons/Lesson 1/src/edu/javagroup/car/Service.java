package edu.javagroup.car;

import java.util.List;

/**
 * Created by Student on 16.12.2017.
 */
public class Service {

    private String name;
    private List<Car> cars;

    public Service(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}

