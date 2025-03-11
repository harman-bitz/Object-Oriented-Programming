import java.util.*;
class BookDetails{
    private String title;
    private String Author;
    private int price;


    // default constructor 
    BookDetails(){
        title = "Is it good to be too ture ";
        Author = "Prajakta Kohli ";
        price = 1000;
    }

    // Parameterized constructor 
    BookDetails(String title , String Author, int price){
        this.title = title;
        this.Author = Author;
        this.price = price;
    }

    void DisplayResult(){
        System.out.println("Title of the Book -> " + title);
        System.out.println("Author of the title is -> "+ Author);
        System.out.println("Price of the Book -> "+"INR "+ price);
    }
}
public class book{
    public static void main(String[] args) {
        BookDetails book1 = new BookDetails();
        BookDetails book2 = new BookDetails("Something 20s","Pearson",1200);
        book1.DisplayResult();
        System.out.println("-------------");
        book2.DisplayResult();
    }
}