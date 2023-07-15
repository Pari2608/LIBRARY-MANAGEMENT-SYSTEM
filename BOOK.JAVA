/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

// Java Program to Illustrate book Class that


// Importing required classes
import java.util.Scanner;

// Class
public class book {

	// Class data members
	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;

	// Creating object of Scanner class to
	// read input from users
	Scanner input = new Scanner(System.in);

	// Method
	// To add book details
	public book()
	{
		// Display message for taking input later
		// taking input via
		// nextInt() and nextLine() standard methods
		System.out.println("Enter Serial No of Book:");
		this.sNo = input.nextInt();
		input.nextLine();

		System.out.println("Enter Book Name:");
		this.bookName = input.nextLine();

		System.out.println("Enter Author Name:");
		this.authorName = input.nextLine();

		System.out.println("Enter Quantity of Books:");
		this.bookQty = input.nextInt();
		bookQtyCopy = this.bookQty;
	}
}
