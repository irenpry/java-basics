package org.itmo.java.lesson7;

public class Plane {
    private String model;
    private Wing wing;

    public Plane(String model, int wingWeight) {
        this.model = model;
        this.wing = new Wing(wingWeight);
    }

    class Wing {
        public Integer weight;

        Wing(int weight) {
            this.weight = weight;
        }

        public String getWingWeight() {
            if (weight % 10 == 1) {
                return weight + " тонна";
            } else if (weight % 10 < 5) {
                return weight + " тонны";
            } else {
                return weight + " тонн";
            }
        }
    }

    void printPlaneInfo() {
        System.out.printf("У самолета %s вес крыла %s\n", model, wing.getWingWeight());
    }

    public static void main(String[] args) {
        Plane boeing = new Plane("Boeing 737", 43);
        Plane airbus = new Plane("Airbus A320", 46);
        boeing.printPlaneInfo();
        airbus.printPlaneInfo();
    }
}
