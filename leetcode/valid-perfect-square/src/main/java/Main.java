package main.java;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(4));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 1) {
            return true;
        }

        long left = 1;
        long right = num;
        long mid;
        long result;

        while (left <= right) {
            mid = left + (right - left) / 2;
            result = mid * mid;

            if (result > num) {
                right = mid - 1;
            } else if (result < num) {
                left = mid + 1;
            } else {
                return true;
            }


        }

        return false;
    }
}
