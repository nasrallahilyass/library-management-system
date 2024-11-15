package com.example.java;

public class Main {
    public static void main(String[] args) {
        Library goetheLibrary = new Library();

        // addBooking goetheLibrary:
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 123456789);
        Book book2 = new Book("1984", "George Orwell", 234567890);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 345678901);
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 456789012);
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", 567890123);
        Book book6 = new Book("The Hobbit", "J.R.R. Tolkien", 678901234);
        Book book7 = new Book("Fahrenheit 451", "Ray Bradbury", 789012345);
        Book book8 = new Book("Moby-Dick", "Herman Melville", 890123456);
        Book book9 = new Book("War and Peace", "Leo Tolstoy", 901234567);
        Book book10 = new Book("Crime and Punishment", "Fyodor Dostoevsky", 123450987);

        // Students
        Student student1 = new Student(101, "Alice", 16, "10th Grade");
        Student student2 = new Student(102, "Bob", 17, "11th Grade");
        Student student3 = new Student(103, "Charlie", 16, "10th Grade");
        Student student4 = new Student(104, "Diana", 18, "12th Grade");
        Student student5 = new Student(105, "Evan", 17, "11th Grade");

        // Teachers
        Teacher teacher1 = new Teacher(201, "Mr. Smith", 45, "Mathematics");
        Teacher teacher2 = new Teacher(202, "Mrs. Johnson", 38, "English Literature");
        Teacher teacher3 = new Teacher(203, "Dr. Brown", 50, "Physics");
        Teacher teacher4 = new Teacher(204, "Ms. Davis", 29, "History");
        Teacher teacher5 = new Teacher(205, "Mr. Wilson", 40, "Biology");


        // Library Methods:
        goetheLibrary.addBook(book1);
        goetheLibrary.addBook(book2);
        goetheLibrary.addBook(book3);
        goetheLibrary.addBook(book4);
        goetheLibrary.addBook(book5);
        goetheLibrary.addBook(book6);
        goetheLibrary.addBook(book7);
        goetheLibrary.addBook(book8);
        goetheLibrary.addBook(book9);
        goetheLibrary.addBook(book10);

        // Student Methods:
        goetheLibrary.addStudent(student1);
        goetheLibrary.addStudent(student2);
        goetheLibrary.addStudent(student3);
        goetheLibrary.addStudent(student4);
        goetheLibrary.addStudent(student5);
        // Teacher Methods:
        goetheLibrary.addTeacher(teacher1);
        goetheLibrary.addTeacher(teacher2);
        goetheLibrary.addTeacher(teacher3);
        goetheLibrary.addTeacher(teacher4);
        goetheLibrary.addTeacher(teacher5);



        System.out.println("####################################");
        System.out.println("####################################");
        goetheLibrary.viewBooks();
        System.out.println("####################################");
        System.out.println("####################################");
        goetheLibrary.viewStudents();
        System.out.println("####################################");
        System.out.println("####################################");
        goetheLibrary.viewTeachers();
        System.out.println("####################################");
        System.out.println("####################################");
    }
}
