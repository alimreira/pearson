package com.example.pearsonFive.java8Optional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentStreamDemo {
    String name;
    int age;
    float grade;

    public StudentStreamDemo(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {
        for (StudentStreamDemo d : students()) {
            if (d.getAge() > 10) {
                System.out.println(d);
            }
        }

        //with stream api
        List<StudentStreamDemo> sd = students().stream().filter((c) -> c.age > 10).collect(Collectors.toList());
        System.out.println(sd);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public static List<StudentStreamDemo> students () {
        List<StudentStreamDemo> demo = List.of(new StudentStreamDemo("first",12,98.3f),
                new StudentStreamDemo("third",11,78.6f),
                 new StudentStreamDemo("fifth",13,71.0f),
                new StudentStreamDemo("second",12, 94.6f));
        return demo;
    };

    @Override
    public String toString() {
        return "StudentStreamDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
