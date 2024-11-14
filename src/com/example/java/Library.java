package com.example.java;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private ArrayList<Teacher> teachers;

    // Constructors
    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Getters && Setters:
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    public ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    // Methods:

    // Methods for Books
    public void viewBooks() {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        //System.out.println("Book added to library");
    }

    public void checkOutBook(int ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                books.remove(book);  // Remove book from list
//                System.out.println("Book checked out: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    // Methods for Users:
    public void addUser(User user) {
        users.add(user);
//        System.out.println("User added to library system: " + user.getName());
    }

    public void removeUser(User user) {
        users.remove(user);
//        System.out.println("User removed from library system: " + user.getName());
    }

    public void viewUsers() {
        System.out.println("List of Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Methods for teachers:
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    public void viewTeachers() {
        System.out.println("List of Teachers:");

    }

}
