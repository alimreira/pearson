package com.example.pearsonFive.java8Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpObjSort {
        private int id;
        private String name;
        private int age;
        private Double salary;


    public EmpObjSort(int id, String name, int age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<EmpObjSort> sorting = new ArrayList<>();
        sorting.add(new EmpObjSort(210,"Sharon",34,4566.34));
        sorting.add(new EmpObjSort(215,"John",23,3421.90));
        sorting.add(new EmpObjSort(201,"Henry",32,6543.99));
        sorting.add(new EmpObjSort(214,"Tilda",25,5312.89));
        sorting.add(new EmpObjSort(209,"Unique",38,1287.9));

        List<EmpObjSort> so1 = sorting.stream().sorted((o1,o2)-> o1.getId()-o2.getId()).collect(Collectors.toList());
        List<EmpObjSort> so2 = sorting.stream().sorted((o1,o2)-> o2.getAge() -o1.getAge()).collect(Collectors.toList());
        List<EmpObjSort> so3 = sorting.stream().sorted((o1,o2)-> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        List<EmpObjSort> so4 = sorting.stream().sorted((o1,o2)-> (int) (o2.getSalary() -o1.getSalary())).collect(Collectors.toList());
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so3);
        System.out.println(so4);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpObjSort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
