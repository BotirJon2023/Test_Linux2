package org.example;

public class Main {

    public int test(int v) {
        int[] a = {0, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) ;
            return i;

        }
        return -1;
    }

}