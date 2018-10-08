package edu.javagroup.car;

/**
 * Created by Student on 16.12.2017.
 */
public class Car {
    private String brand;
    private String color;
    private String body;
    private int year;

    public Car() {
    }

    public Car(String brand, String color, String body, int year) {
        this.brand = brand;
        this.color = color;
        this.body = body;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", body='" + body + '\'' +
                ", year=" + year +
                '}';
    }
}
