package com.example.ict.demo.model;

public class Student {

    private String name;
    private int roll;
    private String dept;

    public Student() {

    }

    public Student(String name, int roll, String dept) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", dept='" + dept + '\'' +
                '}';
    }
}
