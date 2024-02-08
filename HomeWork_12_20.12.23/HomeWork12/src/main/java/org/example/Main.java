package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4};
        shuffleArray(input);
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}