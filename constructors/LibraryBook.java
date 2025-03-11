import java.util.Scanner;

class Book{
    private String bookName;
    private String Author;
    private boolean availability;
    private int pricePerDay;
    private int Days;


    // constructor 
    Book(String bookName,String Author, boolean availability,int pricePerDay, int Days){
        this.bookName = bookName;
        this.Author = Author;
        this.availability = availability;
        this.pricePerDay = pricePerDay;
        this.Days = Days;
    }

    // method to borrow
    void borrowBook(){
        if(availability == true){
            int totalCost = pricePerDay*Days;
            System.out.println("Total cost for renting "+bookName+" for "+Days+ " Days will be "+totalCost);
        }else{
            System.out.println("Sorry !! This book is not avaialble ");
        }
    }

}
public class LibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter title of the book ");
String bookName = sc.nextLine();
System.out.println("Enter name of the Author ");
String Author = sc.nextLine();
System.out.println("Check Availability ");
boolean availability = sc.nextBoolean();
System.out.println("Enter price per Day of the Book ");
int pricePerDay = sc.nextInt();
System.out.println("Enter number of days to rent ");
int Days = sc.nextInt();
Book book = new Book(bookName, Author, availability, pricePerDay, Days);
book.borrowBook();
    }

}
