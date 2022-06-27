package org.itmo.java.lesson3;

public class JavaProgram {

    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        Car car = new Car(Color.BLACK);
        Car car1 = new Car(Color.RED,1500);

        System.out.println(car);
        System.out.println(car1);

        House house = new House();
        house.setInfo(12,2019,"ЖК Весна 1");
        House house1 = new House();
        house1.setInfo(24,2021,"ЖК Весна 5");

        System.out.println(house + " Возраст дома: " + house.getBuildingAge(2022));
        System.out.println(house1 + " Возраст дома: " + house1.getBuildingAge(2022));

        Tree tree = new Tree();
        Tree tree1 = new Tree(34,"Ясень");
        Tree tree2 = new Tree(100,"Дуб",true);

        System.out.println(tree1);
        System.out.println(tree2);
    }
}
