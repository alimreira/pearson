package com.example.pearsonFive.tightCoupling;

public class BinarySearchImpl {
    Sort sort = new Sort();
    Search search = new Search();

    public int sortAndSearch (int[] arr, int num) {
        sort.arr(arr);
        int result = search.searchArr(arr,num);
        return result;
    }

    public static void main(String[] args) {
        BinarySearchImpl bin = new BinarySearchImpl();
        int test =bin.sortAndSearch(new int[] {21,15,17,8,9,10,2,8,6}, 15);
        System.out.println(test);

    }
}
