package com.example.pearsonFive.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearching {

    private static Sorting sorting;
    private static SearchingInterface searchingInterface;

    @Autowired
    public BinarySearching(Sorting sorting, SearchingInterface searchingInterface) {
        this.sorting = sorting;
        this.searchingInterface = searchingInterface;
    }

    public static void main(String[] args) {
        //BinarySearching bsh = new BinarySearching(new Sorted(),new Searching());
       // int th = bsh.sortThenSearch(new int[] {12,3,15,27,18,9,15},27);
       // System.out.println(th);
    }

    public int sortThenSearch (int[] arr, int num) {
        sorting.getSorted(arr);
        int bind = searchingInterface.arrSearched(arr,num);
        return bind;
    }


}
