package org.itmo.java.lesson6.exercise3;

public class Truck extends Car {
    private Integer wheelsCount;
    private Integer maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsCount, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newWheelsCount) {
        this.wheelsCount = newWheelsCount;
    }

    @Override
    public void outPut () {
        super.outPut();
        System.out.println("Максимальный вес - " + maxWeight + ", количество колес - " + wheelsCount);
    }
}
