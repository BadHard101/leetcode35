package org.example;

import java.util.Arrays;

public class Main {
    public int searchInsert(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        if (res < 0) return Math.abs(res + 1);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}