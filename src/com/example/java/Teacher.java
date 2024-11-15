package com.example.java;

public class Teacher extends User {
    private String subject;

    // Constructors:
    public Teacher() {
    }

    ;

    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
    }

    // Getters and setters


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() + '\'' +
                "name='" + getName() + '\'' +
                "age=" + getAge() + '\'' +
                "subject='" + subject + '\'' +
                '}';
    }
}
