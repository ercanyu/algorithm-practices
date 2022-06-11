package main.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int currentCount = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = currentCount > maxCount ? currentCount : maxCount;
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
