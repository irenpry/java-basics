package org.itmo.java.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    static int[] getRandomArray() {
        int[] array = new int[getArrayLength()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 50;
        }
        return array;
    }

    static int getArrayLength() {
        System.out.print("Укажите длину массива: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        while (length < 1) {
            System.out.println("Длина массива не может быть меньше 1");
            System.out.print("Укажите длину массива: ");
            length = scan.nextInt();
        }
        return length;
    }

    static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int leftLength = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, leftLength);
        int[] right = Arrays.copyOfRange(array, leftLength, array.length);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeArrays(left, right);
    }

    static int[] mergeArrays(int[] left, int[] right) {
        int rightPointer = 0;
        int leftPointer = 0;
        int resultPointer = 0;
        int[] resultArray = new int[left.length + right.length];

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    resultArray[resultPointer++] = left[leftPointer++];
                } else {
                    resultArray[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                resultArray[resultPointer++] = left[leftPointer++];
            } else {
                resultArray[resultPointer++] = right[rightPointer++];
            }
        }
        System.out.println("Склейка");
        System.out.println(Arrays.toString(resultArray));

        return resultArray;
    }
}
