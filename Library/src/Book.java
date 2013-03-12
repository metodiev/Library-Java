import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Book {
	
	public String nameOfBook;
	public String authorOfBook;
	public String genre;
	public int isbn;
	public String date;
	
	
	public void getBook(){
		System.out.println("Enter new book");
		System.out.println("Enter name of book");
		Scanner input = new Scanner(System.in);
		this.nameOfBook  = input.nextLine();
	}
	
	public void getAuthor(){
		System.out.println("Enter Author of book");
		System.out.println("Enter name of Author:");
		Scanner input = new Scanner(System.in);
		this.authorOfBook  = input.nextLine();
		
	}
	
	public void getGenre(){
		System.out.println("Enter the genre of book:");
		Scanner input = new Scanner(System.in);
		this.genre  = input.nextLine();
	}
	
	public void getIsbn(){
		System.out.println("Enter the ISBN of book:");
		Scanner input = new Scanner(System.in);
		this.isbn  = input.nextInt();
	}
	
	public void getDate(){
		Calendar currentDate = Calendar.getInstance();
		  SimpleDateFormat formatter= 
		  new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
		  String dateNow = formatter.format(currentDate.getTime());
		  String date;
		  this.date = dateNow;
	}
		
		 
		
	
}