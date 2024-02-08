package org.example;

import java.util.Arrays;
import java.util.Random;

public class HomeWork12 {


    public static void main(String[] args) {
        int[] array = createUnsortedArray(100);
        System.out.println(Arrays.toString(array));

        boolean isSorted = isSorted(array);
        System.out.println("Массив отсортирован: " + isSorted);
    }


    public static int[] createUnsortedArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генерация случайных цифр от 0 до 99
        }

        return array;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}