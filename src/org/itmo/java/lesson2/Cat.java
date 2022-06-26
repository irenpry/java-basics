package org.itmo.java.lesson2;

public class Cat {
    private String name;
    private int age;
    private byte gender;
    private Breed breed;
    private boolean isNeutered;

    public Cat() {
        this.name = "Без имени";
        this.breed = Breed.NON_PEDIGREE;
    }
    public Cat(String name) {
        this.name = name;
        this.breed = Breed.NON_PEDIGREE;
    }

    public Cat(String name, int age) {
        this(name);
        this.age = age;
    }

    public Cat(String name, int age, byte gender) {
        this(name,age);
        this.gender = gender;
    }

    public Cat(String name, int age, byte gender, Breed breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    public Cat(String name, int age, byte gender, Breed breed, boolean isNeutered) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.isNeutered = isNeutered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }
}
