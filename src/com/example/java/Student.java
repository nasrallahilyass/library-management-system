package com.example.java;

public class Student extends User {

    private String grade;

    // Constructors:
    public Student() {
    }

    public Student(int id, String name, int age, String grade) {
        super(id, name, age);
        this.grade = grade;
    }

    // Getters and setters:

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + getId() + '\'' +
                "name=' " + getName() + '\'' +
                "age= " + getAge() + '\'' +
                "grade= " + grade +
                '}';
    }
}
