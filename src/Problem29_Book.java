/*
id - int
pages - int
title - String
author - String
price - double
The above attributes should be private, write getters and setters and parameterized constructor as required.

Create a class Solution with main method
--------------------------------------------
Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

findBookWithMaximumPrice :
        =============================
Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and
returns the Book object having the maximum Price if found else return null if not found.

searchBookByTitle :
        =============================
Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as
input and returns the Book object having the mentioned Title if found else return null if not found.

These methods should be called from the main method.

write code to perform the following tasks.

1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print
 "No Book found with mentioned attribute."

         2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object
details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and
printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
result.

All String comparison needs to be in case sensitive.

Input:
1
845
Bengali
        Arijit
525.50
        2
        456
English
        Raju
412.30
        3
        1022
History
        Kaka
525.50
        4
        125
geography
        MN
524
English

Output:

        1 Bengali
3 History
2
        456
*/

import java.util.*;

class Book{
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }
    public int getPages() {
        return this.pages;
    }
    public String toString(){
        return id + " " + title;
    }
}

public class Problem29_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];
        System.out.println("Enter book details: ");
        for(int i = 0; i < books.length; i++){
            System.out.println("Enter book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter book pages: ");
            int pages = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter title: ");
            String title = sc.nextLine();

            System.out.println("Enter author: ");
            String author = sc.nextLine();

            System.out.println("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(id, pages, title, author, price);
        }
        System.out.println("Enter title parameter: ");
        String titleParameter = sc.nextLine();

        // Find all books with maximum price
        List<Book> booksWithMaxPrice = findBooksWithMaximumPrice(books);
        if (booksWithMaxPrice.isEmpty()) {
            System.out.println("No Book found with mentioned attribute.");
        } else {
            for (Book book : booksWithMaxPrice) {
                System.out.println(book);
            }
        }

        Book bookSearched = searchBookByTitle(books , titleParameter);
        if (bookSearched == null) {
            System.out.println("No Book found with mentioned attribute.");
        }else {
            System.out.println(bookSearched.getId());
            System.out.println(bookSearched.getPages());
        }



    }
    public static List<Book> findBooksWithMaximumPrice(Book[] books) {
        List<Book> booksWithMaxPrice = new ArrayList<>();
        if (books.length == 0) return booksWithMaxPrice;

        double maxPrice = books[0].getPrice();
        for (Book book : books) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
            }
        }
        for (Book book : books) {
            if (book.getPrice() == maxPrice) {
                booksWithMaxPrice.add(book);
            }
        }
        return booksWithMaxPrice;

    }
    public static Book searchBookByTitle(Book[] books, String title) {
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
}
