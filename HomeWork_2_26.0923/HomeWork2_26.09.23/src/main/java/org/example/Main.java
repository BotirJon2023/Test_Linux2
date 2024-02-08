package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }


}


/*

1) time = O(n * m) потому что в первом n раз, во втором m раз
for (int i = 0; i < n; ++i) { // n
  for (int j = 1; j < m; ++j) { // m
    a[i][j]++;
  }
}

2) time = O(n^2) потому что 2 цикла с n
for (int i = 0; i < n-1; ++i) {
  for (int j = 0; j < n-i; ++j) {
    a[i][j]++;
  }
}

3) time = O(nlogn) потому что во втором j *= 3
for (int i = 0; i < n; ++i) { // n
  for (int j = 1; j < n; j *= 3) { // logn
    a[i][j]++;
  }
}

4) time = O(n) из-за того, что в первом 1000 раз, а во втором n
for (int i = 0; i < 1000; ++i) { // 1
  for (int j = 1; j < n; ++j) { //  n
    ++count;
  }
}

5) time = O(nlogn) ?
for (int i = 0; i < n; ++i) { // n
  for (int j = 0; j < n/3; ++j) { // logn
    matrx[i][i]++;
  }
}

*/
