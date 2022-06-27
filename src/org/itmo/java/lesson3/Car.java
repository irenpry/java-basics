package org.itmo.java.lesson3;

public class Car {
    private Color color;
    private Integer weight;
    private String name;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
