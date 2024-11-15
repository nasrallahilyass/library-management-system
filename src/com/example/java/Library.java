package com.example.java;

import java.util.ArrayList;

public class Library {
    // Attributes:
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    // Constructors:
    public Library() {
        // Initialize the ArrayLists
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public Library(ArrayList<Book> books, ArrayList<User> users, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.books = new ArrayList<>() ;
        this.users = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Methods for Books:
    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        //System.out.println("Book added successfully!");
    }

    public void checkOutBook(int ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                books.remove(book);
                //System.out.println("Book removed successfully!");
            }
            return;
        }
    }

    // methods for Users:
    public void viewUsers() {
        for (User user : users) {
            //System.out.println(user);
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    // methods for Users Teachers:
    public void viewTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    // methods for Users Students:

    public void viewStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Getters and setters:
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

}
