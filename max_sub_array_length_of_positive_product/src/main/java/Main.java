package main.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        int maxSubArrayLength = maxSubArrayLength(List.of(-1, -1, -1, 1));
        System.out.println(maxSubArrayLength);
    }

    public static int maxSubArrayLength(List<Integer> badges) {
        if (badges == null || badges.size() == 0) {
            return 0;
        }

        int maxLength = 0;
        int positiveLength = 0;
        int negativeLength = 0;

        for (int current : badges) {
            if (current > 0) {
                positiveLength++;
                negativeLength = negativeLength == 0 ? 0 : negativeLength + 1;
            } else {
                int tmpPositiveIndex = positiveLength;
                positiveLength = negativeLength == 0 ? 0 : negativeLength + 1;
                negativeLength = tmpPositiveIndex + 1;
            }

            maxLength = Math.max(maxLength, positiveLength);
        }

        return maxLength;
    }
}
