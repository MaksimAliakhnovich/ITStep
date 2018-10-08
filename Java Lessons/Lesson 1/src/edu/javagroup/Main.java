package edu.javagroup;

import edu.javagroup.car.Car;
import edu.javagroup.car.Service;
import edu.javagroup.vet.Cat;
import edu.javagroup.vet.Dog;
import edu.javagroup.vet.Humster;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car volvo = new Car();
        volvo.setBrand("Volvo");
        volvo.setColor("Blue");
        volvo.setBody("Coupe");
        volvo.setYear(2017);

        Car bmw = new Car("", "", "", 2017);



        List<Car> cars1 = new ArrayList<>();
        cars1.add(new Car("1", "2", "3", 4));
        cars1.add(new Car("4", "3", "2", 1));
        cars1.add(new Car("1", "3", "2", 1));
        cars1.add(new Car("4", "2", "3", 1));

        List<Car> cars2 = new ArrayList<>();
        cars2.add(new Car("1", "2", "3", 4));
        cars2.add(new Car("4", "3", "2", 1));
        cars2.add(new Car("1", "3", "2", 1));
        cars2.add(new Car("4", "2", "3", 1));

        List<Car> cars3 = new ArrayList<>();
        cars3.add(new Car("1", "2", "3", 4));
        cars3.add(new Car("4", "3", "2", 1));
        cars3.add(new Car("1", "3", "2", 1));
        cars3.add(new Car("4", "2", "3", 1));


        List<Service> services = new ArrayList<>();
        services.add(new Service("1", cars1));
        services.add(new Service("2", cars2));
        services.add(new Service("3", cars3));

        for (Service service : services) {
            System.out.println(service.getName());
            List<Car> cars = service.getCars();
            for (Car car : cars) {
                System.out.println(car);
                }

        }

        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat("1", 2, "3"));

        List<Dog> dog = new ArrayList<>();
        cat.add(new Cat("3", 2, "1"));

        List<Humster> humster = new ArrayList<>();
        cat.add(new Cat("1", 3, "2"));



    }
}
