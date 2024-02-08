package org.example;

public class HomeWork4MinimalPath {
    public int findMinimalCost(int[][] pathCost) {
        int rows = pathCost.length;
        int cols = pathCost[0].length;

        int[][] dp = new int[rows][cols];

        // Первая строка и первый столбец
        dp[0][0] = pathCost[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + pathCost[i][0];
        }
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + pathCost[0][j];
        }

        // Остальная часть таблицы
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = pathCost[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] pathCost1 = new int[][]{
                {0, 11, 0, 0, 0, 0},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10, 4, 10, 0}
        };

        int[][] pathCost2 = new int[][]{
                {0, 11, 0, 0, 0, 100},
                {10, 10, 10, 10, 10, 0},
                {10, 10, 10, 4, 10, 0}
        };

        HomeWork4MinimalPath pathCostCalculator = new HomeWork4MinimalPath();
        int minimalCost1 = pathCostCalculator.findMinimalCost(pathCost1);
        int minimalCost2 = pathCostCalculator.findMinimalCost(pathCost2);

        System.out.println("Result for pathCost1: minimalCost = " + minimalCost1);
        System.out.println("Result for pathCost2: minimalCost = " + minimalCost2);
    }
}

