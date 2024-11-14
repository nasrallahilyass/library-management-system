package com.example.java;

public class Student extends User {
    private String gradeLevel;

    // Constructor
    public Student() {
    }

    public Student(int id, String name, String gradeLevel) {
        super(id, name);
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
