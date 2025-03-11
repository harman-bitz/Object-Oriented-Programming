import java.util.ArrayList;

class Book {
	 private String title;
	 private String author;

 
	 public Book(String title, String author) {
	     this.title = title;
	     this.author = author;
	 }
	
	 
	 public String getTitle() {
	     return title;
	 }
	
	 public String getAuthor() {
	     return author;
	 }


	 public void displayBookDetails() {
	     System.out.println("Title: " + title + ", Author: " + author);
	 }
}


class Library {
	 private String libraryName;
	 private ArrayList<Book> books; 

 
	 public Library(String libraryName) {
	     this.libraryName = libraryName;
	     this.books = new ArrayList<>();
	 }


	 public void addBook(Book book) {
	     books.add(book);
	 }


	 public void displayLibraryDetails() {
	     System.out.println("Library: " + libraryName);
	     System.out.println("Books in this Library:");
	     for (Book book : books) {
	         book.displayBookDetails();
	     }
	 }
}
public class lib {

	public static void main(String[] args) {
		 
		    Book book1 = new Book("Java Programming", "James Gosling");
	        Book book2 = new Book("Clean Code", "Robert C. Martin");
	        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger");

	        
	        Library library1 = new Library("Central Library");
	        Library library2 = new Library("City Library");

	        
	        library1.addBook(book1);
	        library1.addBook(book2);

	        library2.addBook(book2);
	        library2.addBook(book3);

	        
	        library1.displayLibraryDetails();
	        System.out.println();
	        library2.displayLibraryDetails();
	}

}