package org.example;

public class HomeWork4SequenceCalculator {

    public static int calculateSequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            int halfN = n / 2;
            return calculateSequence(halfN) + calculateSequence(halfN - 1);
        } else {
            int halfN = n / 2;
            return calculateSequence(halfN) - calculateSequence(halfN - 1);
        }
    }

    public static void main(String[] args) {
        int range = 8; // Задайте диапазон последовательности
        for (int i = 0; i < range; i++) {
            int result = calculateSequence(i);
            System.out.print(result + " ");
        }
    }
}