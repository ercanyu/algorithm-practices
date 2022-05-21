package main.java;

public class Main {

    public static void main(String[] args) {
        int[] values = new int[]{22, 10, 17};
        int[] weights = new int[]{3, 5, 8};
        int weightLimit = 14;
        int valueCount = values.length;

        System.out.println(recursiveKnapsack(weights, values, valueCount, weightLimit));
        System.out.println(dynamicKnapsack(weights, values, valueCount, weightLimit));
    }

    public static int recursiveKnapsack(int[] weights, int[] values, int valueCount, int weightLimit) {
        if (valueCount <= 0) {
            return 0;
        } else if (weights[valueCount - 1] > weightLimit) {
            return recursiveKnapsack(weights, values, valueCount - 1, weightLimit);
        } else {
            return Math.max(recursiveKnapsack(weights, values, valueCount - 1, weightLimit), values[valueCount - 1] + recursiveKnapsack(weights, values, valueCount - 1, weightLimit - weights[valueCount - 1]));
        }
    }

    public static int dynamicKnapsack(int[] weights, int[] values, int valueCount, int weightLimit) {
        if (valueCount <= 0 || weightLimit <= 0) {
            return 0;
        }

        int[][] table = new int[valueCount + 1][weightLimit + 1];
        for (int i = 1; i <= valueCount; i++) {
            for (int j = 1; j <= weightLimit; j++) {
                if (weights[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        return table[valueCount][weightLimit];
    }
}
