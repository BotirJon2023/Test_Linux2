package org.example;

public class LongFactorial {

    public static void main(String[] args) {
        int n = 5; // Изменяемое значение, которое мы вносим самостоятельно
        long result = factorial(n);
        System.out.println("Факториал " + n + " равен " + result);
    }

    private static long factorial(int n) {

    }

    public static long factorial(int n, int m, int a, int count, int matrx) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < m; ++j) {
                a[i][j]++;
            }
        }
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i; ++j) {
                a[i][j]++;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n; j *= 3) {
                a[i][j]++;
            }
        }
        for (int i = 0; i < 1000; ++i) {
            for (int j = 1; j < n; ++j) {
                ++count;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 3; ++j) {
                matrx[i][i]++;
            }
        }
    }
}