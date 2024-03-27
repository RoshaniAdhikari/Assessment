package assignment;

import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String publication;

    public Book(String title, String author,String publication) {
        this.title = title;
        this.author = author;
        this.publication=publication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getPublication() {
    	return publication;
    }

    @Override
    public String toString() {
		return "Book{ Title : " + title  +", Author : " + author +", Publication : "+ publication + "}";    	
    }
}

class Library {
    private Book[] books;
    private int capacity;
    private int bookCount;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < capacity) {
            books[bookCount++] = book;
            System.out.println("Book Added To The Library: " + book);
        } else {
            System.out.println("Library Is Full.You Cannot Add More Books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books In The Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
    public boolean checkAvailability(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book is available in the library: " + books[i]);
                return true;
            }
        }
        System.out.println("Book is not available in the library.");
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);
        System.out.println("*****WELCOME IN OUR LIBRARY*****");
    	System.out.println();

        while (true) {
        	System.out.println();
            System.out.println("Menu In Library Management System :");
            System.out.println();
            System.out.println("1. Add Book To Library");
            System.out.println("2. Display Available Books");
            System.out.println("3. Check Availability Of Books");            
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            System.out.println();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Publication: ");
                    String publication = scanner.nextLine();
                    System.out.println();
                    library.addBook(new Book(title, author,publication));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    System.out.print("Enter Book Title To Check Availability: ");
                    System.out.println();
                    String checkTitle = scanner.nextLine();
                    library.checkAvailability(checkTitle);
                    break;
                case 4:
                    System.out.println("*****Thank you*****");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}