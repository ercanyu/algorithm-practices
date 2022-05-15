package main.java;

import java.util.Arrays;

public class MergeSort {

    public static void sort(String[] names) {
        if (names.length < 2) {
            return;
        }

        int length = names.length;
        int mid = length / 2;

        String[] left = Arrays.copyOfRange(names, 0, mid);
        String[] right = Arrays.copyOfRange(names, mid, length);

        sort(left);
        sort(right);
        merge(names, left, right);
    }

    public static void merge(String[] names, String[] left, String[] right) {
        int length = names.length;
        int leftLength = left.length;
        int rightLength = right.length;

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < length; i++) {
            if (rightIndex >= rightLength) {
                names[i] = left[leftIndex];
                leftIndex++;
            } else if (leftIndex >= leftLength) {
                names[i] = right[rightIndex];
                rightIndex++;
            } else if (left[leftIndex].compareToIgnoreCase(right[rightIndex]) < 0) {
                names[i] = left[leftIndex];
                leftIndex++;
            } else {
                names[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }
}
