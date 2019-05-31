package util;

import edu.princeton.cs.algs4.In;
import first.*;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSort {
    public static void test(Sort test) {
        Integer[] nums = {5, 10, 2, 100, 59, 40, 40, 60, 20, 11, 21, 21, 98, 65, 90, 60, 23, 423, 212, 345, 23, 26, 75, 54, 12, 23, 54};
        test.sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        TestSort.test(new QuickSort<Integer>());
    }
}