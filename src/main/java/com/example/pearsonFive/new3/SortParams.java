package com.example.pearsonFive.new3;

import java.util.Comparator;
import java.util.List;

public class SortParams {

    public static void main(String[] args) {
            List<String> st = List.of("Mango","Pineapple","Pear","Carrot","Guava","Pawpaw","Apple","Banana");
            st.stream().sorted(Comparator.naturalOrder()).forEach((c)-> System.out.print(c+ ", "));
            System.out.println();
            st.stream().sorted(Comparator.reverseOrder()).forEach((c)-> System.out.print(c+ ", "));
            System.out.println();
            st.stream().sorted((x,y)->x.compareTo(y)).forEach((c)-> System.out.println(c));
            System.out.println();
            System.out.println();
            st.stream().sorted((o1,o2)->o1.compareTo(o2)).forEach((c)-> System.out.println(c));
            System.out.println();
            System.out.println();
            st.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach((c)-> System.out.println(c));


        }
    }

