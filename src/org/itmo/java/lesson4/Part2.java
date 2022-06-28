package org.itmo.java.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        System.out.println("/* Первое задание */");
        int[] array = {3, 5, 6, 7, 90, -5};
        boolean result = true;
        if (array.length < 2) {
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result ? "OK" : "Please, try again");

        System.out.println("/* Второе задание */");
        Scanner scan = new Scanner(System.in);
        int length = Sort.getArrayLength();
        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            array1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("/* Третье задание */");
        switchFirstAndLast(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("/* Четвертое задание */");
        System.out.println(getFirstUnique(array1) == null ? "Нет уникального" : getFirstUnique(array1));
    }

    static void switchFirstAndLast(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        array[0] = last;
        array[array.length - 1] = first;
    }

    static Integer getFirstUnique(int[] array) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        int index;
        Integer unique = null;
        if (array.length < 2) {
            unique = array[0];
        } else {
            for (int i : array) {
                index = Arrays.binarySearch(sortedArray, i);
                if (index == 0) {
                    if (sortedArray[index] != sortedArray[index + 1]) {
                        unique = sortedArray[index];
                        break;
                    } else {
                        continue;
                    }
                } else if (index == sortedArray.length - 1) {
                    if (sortedArray[index - 1] != sortedArray[index]) {
                        unique = sortedArray[index];
                        break;
                    } else {
                        continue;
                    }
                } else if (sortedArray[index - 1] != sortedArray[index] && sortedArray[index] != sortedArray[index + 1]) {
                    unique = sortedArray[index];
                    break;
                }
            }
        }
        return unique;
    }
}

