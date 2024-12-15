package com.example.pearsonFive.java8Optional;

import java.util.ArrayList;
import java.util.List;

public class EmpObjSortDto {

    private int id;
    private String name;
    private Double salary;


    public static void main(String[] args) {
        //To map EmpObjSort to EmpObjSortDto
        List<EmpObjSort> sorting = new ArrayList<>();
        sorting.add(new EmpObjSort(210,"Sharon",34,4566.34));
        sorting.add(new EmpObjSort(215,"John",23,3421.90));
        sorting.add(new EmpObjSort(201,"Henry",32,6543.99));
        sorting.add(new EmpObjSort(214,"Tilda",25,5312.89));
        sorting.add(new EmpObjSort(209,"Unique",38,1287.9));



    }


    public EmpObjSortDto(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpObjSortDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
