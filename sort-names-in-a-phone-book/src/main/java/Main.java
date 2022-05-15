package main.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Ercan", "Mert", "Hüseyin", "Samed", "Emre", "Ahmet", "Himmet", "Onur", "Erkan", "Mikail"};
        MergeSort.sort(names);
        Arrays.stream(names).forEach(System.out::println);
    }

}
