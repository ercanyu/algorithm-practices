package main.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Total Count: " + triangleNumber(new int[]{2, 3, 4, 4}));
    }

    public static int triangleNumber(int[] nums) {
        int count = 0;
        int length = nums.length;

        if (length < 3) {
            return count;
        }
        Arrays.sort(nums);

        int left;
        int right;

        for (int i = 2; i < length; i++) {
            left = 0;
            right = i - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}
