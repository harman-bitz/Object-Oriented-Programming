class Book {
    String title;
    int publicationYear;
    
    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (inherits from Book)
class Author extends Book {
    String name;
    String bio;
    
    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Calling the superclass constructor
        this.name = name;
        this.bio = bio;
    }
    
    // Overriding displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class libraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Author author = new Author("Java Programming", 2021, "Rahul Sharma", "Expert in Java and software development.");
        
        // Displaying book and author information
        author.displayInfo();

	}

}