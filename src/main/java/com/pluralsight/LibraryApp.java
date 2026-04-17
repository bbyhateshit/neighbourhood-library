package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Book[] books = new Book[] {
                new Book(1,  "978-0143127-741", "To Kill a Mockingbird", null, false),
                new Book(2,  "978-0307277-671", "1984", null, false),
                new Book(3,  "978-0061120-084", "Brave New World", null, false),
                new Book(4,  "978-0743273-565", "The Great Gatsby", null, false),
                new Book(5,  "978-0307387-899", "Fahrenheit 451", null, false),
                new Book(6,  "978-0439023-528", "The Hunger Games", null, false),
                new Book(7,  "978-0544003-415", "The Hobbit", null, false),
                new Book(8,  "978-0307474-278", "The Road", null, false),
                new Book(9,  "978-0060850-524", "The Alchemist", null, false),
                new Book(10, "978-0385472-579", "The Things They Carried", null, false),
                new Book(11, "978-0140283-334", "Lord of the Flies", null, false),
                new Book(12, "978-0307346-605", "The Book Thief", null, false),
                new Book(13, "978-0062315-007", "The Giver", null, false),
                new Book(14, "978-0143039-433", "Animal Farm", null, false),
                new Book(15, "978-0307278-449", "Life of Pi", null, false),
                new Book(16, "978-0060935-467", "Beloved", null, false),
                new Book(17, "978-0307389-732", "The Kite Runner", null, false),
                new Book(18, "978-0142437-230", "Moby-Dick", null, false),
                new Book(19, "978-0140449-266", "Crime and Punishment", null, false),
                new Book(20, "978-0140449-181", "The Odyssey", null, false)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the library");
        System.out.println("t1) Show available books");
        System.out.println("t2) Show checked out books");
        System.out.println("t0) Exit");
        System.out.print("Please choose an option");

        int option = scanner.nextInt();


    for (int i = 0; i < books.length; i++) {
        System.out.println(books[i]);
    }

    }

}
