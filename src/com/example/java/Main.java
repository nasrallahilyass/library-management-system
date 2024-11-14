package com.example.java;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Data: (Books and Users)
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 123456789);
        Book book2 = new Book("1984", "George Orwell", 234567890);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 345678901);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 456789012);
        Book book5 = new Book("Moby Dick", "Herman Melville", 567890123);

        User user1 = new User(1, "ALEX Jones");
        User user2 = new User(2, "Mery Christopher");
        User user3 = new User(3, "Bob Carter");


        // Add Books:
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        //Add Users:
        library.addUser(user1);
        library.addUser(user2);
        library.removeUser(user3);

        // Check Out Book:
        library.checkOutBook(567890123);

        System.out.println("###########################################");
        System.out.println("###########################################");
        library.viewBooks();
        System.out.println("###########################################");
        System.out.println("###########################################");
        library.viewUsers();
        System.out.println("###########################################");
        System.out.println("###########################################");
    }
}
