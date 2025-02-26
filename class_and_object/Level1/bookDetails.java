//Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
import java.util.*;
class Book{
    private String title;
    private String author;
    private int price;

    // callng constructor
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // creating method to display
    public void displayResult(){
        System.out.println("Title of the book is "+ title);
        System.out.println("Author of the book is "+ author);
        System.out.println("Price of the book is "+ price);
    }
}
public class bookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tite of the Book ");
        String title = sc.nextLine();
        System.out.println("Enter author of the book ");
        String author = sc.nextLine();
        System.out.println("Enter price of the Book ");
        int price = sc.nextInt();
        Book book = new Book(title, author, price);
        book.displayResult(); 
    }
    
}
