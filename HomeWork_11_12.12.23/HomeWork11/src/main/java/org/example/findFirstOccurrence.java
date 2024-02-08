package org.example;

public class findFirstOccurrence {
    // Функция для нахождения первого вхождения числа x в отсортированном массиве arr[]
    static int findFirstOccurrence(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return findFirstOccurrence(arr, mid + 1, high, x);
            } else {
                return findFirstOccurrence(arr, low, mid - 1, x);
            }
        }

        return -1;
    }

    // Функция для нахождения последнего вхождения числа x в отсортированном массиве arr[]
    static int findLastOccurrence(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                return findLastOccurrence(arr, low, mid - 1, x);
            } else {
                return findLastOccurrence(arr, mid + 1, high, x);
            }
        }

        return -1;
    }

    // Функция для подсчёта вхождений числа x в отсортированном массиве arr[]
    static int countOccurrences(int arr[], int x) {
        int first = findFirstOccurrence(arr, 0, arr.length - 1, x);

        if (first == -1) {
            return 0;
        }

        int last = findLastOccurrence(arr, first, arr.length - 1, x);

        return last - first + 1;
    }

    // Тестовая функция
    public static void main(String args[]) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        int count = countOccurrences(arr, x);
        System.out.println("Число " + x + " встречается " + count + " раз(а)");
    }
}
