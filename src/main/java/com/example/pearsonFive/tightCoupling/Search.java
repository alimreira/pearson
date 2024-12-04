package com.example.pearsonFive.tightCoupling;

import java.util.Arrays;

public class Search {
    Sort sort = new Sort();
    public int searchArr (int[] arr, int num) {
        sort.arr(arr);
        int hold = Arrays.binarySearch(arr,num);
        return hold;
    }
}
