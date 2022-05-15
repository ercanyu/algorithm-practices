package main.java;

import java.util.Arrays;

public class Main {
    static int[] coins = {1, 5, 10, 25, 50, 100};

    public static void main(String[] args) {

        double money = 5.07;
        double price = 0.05;

        int[] change = calculateChange(money, price);
        System.out.println(Arrays.toString(change));
    }

    private static int[] calculateChange(double money, double price) {
        int totalChange = (int) (money * 100) - (int) (price * 100);
        int[] changes = new int[6];

        for (int i = 5; i >= 0; i--) {
            changes[i] = totalChange / coins[i];
            totalChange = totalChange % coins[i];
        }

        return changes;
    }
}
