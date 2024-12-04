package com.example.pearsonFive.looseCoupling;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class Sorted implements Sorting{

    @Override
    public void getSorted(int[] unsorted) {
        Arrays.sort(unsorted);
    }

    public static void main(String[] args) {
//        Sorted st = new Sorted();
//        st.getSorted(new int[]{22,12,6,16,8});
//        System.out.println(Arrays.toString(new int[]{22,12,6,16,8}));
    }
}
