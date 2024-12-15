package com.example.pearsonFive.java8Optional;

public class STREAM {

    /**
     * STREAM represents a sequence of objects from a source that supports aggregate operation
     * The stream package, contains classes,interfaces and enum that enables aggregate operation.
     * How stream works: source -> filter -> sort -> map -> forEach(iterate) -> collect.
     * A stream of elements is the source upon which the above aggregate operations can be performed.
     * A collection or an array can also be a source.
     *
     *
     * //Stream as a source
     *         Stream<String> st = Stream.of("first","next","fourth","second");
     *         st.forEach(System.out::print);
     *
     *         System.out.println();
     *         Stream<Integer> inn = Stream.of(12,89,77,45,34,2);
     *         inn.forEach((c)-> {
     *             if(c%2 == 0){
     *                 System.out.println(c);
     *             }
     *         });
     *
     *         //Collection as stream api source
     *         List<String> str = new ArrayList<>();
     *         str.add("Morning");
     *         str.add("Dawn");
     *         str.add("Daylight");
     *         str.add("Bright");
     *         List<String> res = str.stream().sorted((x,y) -> {
     *             return x.compareTo(y);
     *         }).collect(Collectors.toList());
     *         System.out.println(res);
     *
     *         //Array as Stream api source
     *         Arrays.stream(new int[] {12,89,19,45,34,21,90}).filter((x) -> x > 30).forEach((x) -> System.out.println(x));
     *
     * */



}
