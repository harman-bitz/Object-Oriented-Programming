package week2_assignment4;

import java.util.*;


interface Reservable {
	boolean reserveItem(String borrower);
	boolean checkAvailability();
}


abstract class LibraryItem implements Reservable {
	private String itemId;
	private String title;
	private String author;
	private boolean isReserved;
	private String borrower;

	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.isReserved = false;
		this.borrower = "";
	}

	public abstract int getLoanDuration();

	public String getItemDetails() {
		return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
	}

	@Override
	public boolean reserveItem(String borrower) {
		if (!isReserved) {
			this.isReserved = true;
			this.borrower = borrower;
			return true;
		}
		return false;
	}

	@Override
	public boolean checkAvailability() {
		return !isReserved;
	}
}


class Book extends LibraryItem {
	public Book(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 14; 
	}
}


class Magazine extends LibraryItem {
	public Magazine(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 7; 
	}
}


class DVD extends LibraryItem {
	public DVD(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 5; 
	}
}


public class LibraryManagementSystem {
	public static void main(String[] args) {
		List<LibraryItem> items = new ArrayList<>();
		items.add(new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"));
		items.add(new Magazine("M202", "National Geographic", "Various"));
		items.add(new DVD("D303", "Inception", "Christopher Nolan"));

		for (LibraryItem item : items) {
			System.out.println(item.getItemDetails());
			System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
			System.out.println("Available: " + item.checkAvailability());
         	System.out.println("Reserved: " + item.reserveItem("John Doe"));
         	System.out.println("-----------------------------");
		}
	}
}
