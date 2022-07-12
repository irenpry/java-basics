package org.itmo.java.lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /** 1 */
        Collection<String> collection = new ArrayList<>();
        collection.add("test");
        collection.add("test");
        collection.add("test2");
        for (String s : collection) {
            System.out.println(s);
        }
        dropDuplicate(collection);
        System.out.println("Убрали дубликаты");
        for (String s : collection) {
            System.out.println(s);
        }

        /** 2 */
        List<Integer> arrayList = new ArrayList<>();
        fillList(arrayList, 1_000_000);
        getRandomItem(arrayList,100_000);
        List<Integer> linkedList = new LinkedList<>();
        fillList(linkedList, 1_000_000);
        getRandomItem(linkedList,10);

        /** 3 */
        List<User> userList = new ArrayList<>();
        Points points = new Points();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            userList.add(user);
            points.addRandomPoints(user);
        }
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                System.out.printf("У юзера %s %d очков",name,points.getPoints(user));
                break;
            }
        }
    }

    public static void dropDuplicate(Collection<String> collection) {
        Set<String> set = new HashSet<>();
        set.addAll(collection);
        collection.clear();
        collection.addAll(set);
    }

    public static void fillList(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add((int) (Math.random() * count));
        }
    }

    public static void getRandomItem(List<Integer> list, int count) {
        long time = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < count; i++) {
            list.get((int) (Math.random() * size));
        }
        System.out.printf("На выборку %d элементов из %s ушло %f милисекунд\n", count, list.getClass(), (double) System.currentTimeMillis() - time);
    }
}
