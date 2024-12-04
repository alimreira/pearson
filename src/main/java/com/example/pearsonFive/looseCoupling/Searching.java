package com.example.pearsonFive.looseCoupling;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Searching implements SearchingInterface{
    @Override
    public int arrSearched(int[] arr, int digit) {
        int hold = Arrays.binarySearch(arr,digit);
        return hold;
    }

    public static void main(String[] args) {
//        Searching sh = new Searching();
//        int test = sh.arrSearched(new int[] {10,15,3,7,5}, 4);
//        System.out.println(test);
    }
}
