package org.example;

public class HomeWork13 {

    public static void main(String[] args) {
        Integer[] data = {1, 3, 1, 5, 0, 7, 8};
        int k = 1;
        int result = findKthLargest(data, k);
        System.out.println(result);
    }

    public static int findKthLargest(Integer[] data, int k) {
        return quickSelect(data, 0, data.length - 1, k);
    }

    public static int quickSelect(Integer[] data, int left, int right, int k) {
        if (left == right) {
            return data[left];
        }

        int pivotIndex = partition(data, left, right);
        if (pivotIndex == k) {
            return data[pivotIndex];
        } else if (k < pivotIndex) {
            return quickSelect(data, left, pivotIndex - 1, k);
        } else {
            return quickSelect(data, pivotIndex + 1, right, k);
        }
    }

    public static int partition(Integer[] data, int left, int right) {
        int pivot = data[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, right);
        return i + 1;
    }

    public static void swap(Integer[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
