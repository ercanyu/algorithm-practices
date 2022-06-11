package main.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    public static int longestOnes(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }

        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int length = nums.length;

        while (end < length) {
            if (nums[end] == 0) {
                zeroCount++;
            }
            end++;

            if (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }
        }

        return end - start;
    }
}
