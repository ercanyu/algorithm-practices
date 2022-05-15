package main.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static final int MINEFIELD_SIZE = 4;

    public static void main(String[] args) {
        int[][] minefield = {
                {0, 0, 0, 1,},
                {0, 0, 0, 0,},
                {1, 1, 1, 1},
                {0, 0, 0, 1}};
        int[][] surroundingMineCounts = new int[MINEFIELD_SIZE][MINEFIELD_SIZE];

        for (int i = 0; i < MINEFIELD_SIZE; i++) {
            for (int j = 0; j < MINEFIELD_SIZE; j++) {
                surroundingMineCounts[i][j] = findSurroundingMineCount(minefield, i, j);
            }
        }

        Stream.of(surroundingMineCounts).map(Arrays::toString).forEach(System.out::println);
    }

    public static int findSurroundingMineCount(int[][] minefield, int x, int y) {
        int mineCount = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i < 0 || j < 0 || i + 1 > MINEFIELD_SIZE || j + 1 > MINEFIELD_SIZE) {
                    continue;
                }
                if (!(x == i && y == j) && minefield[i][j] == 1) {
                    mineCount++;
                }
            }
        }

        return mineCount;
    }


}
