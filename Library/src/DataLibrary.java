import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class DataLibrary {
	public void recordingData(String book, String author, String genre, int isbn, String dateOfIssue){
		// Write text file 
	   PrintStream fileWriter = null;
	   try {
		try {
			fileWriter = new PrintStream(book + ".txt","windows-1251");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	   } catch (FileNotFoundException e) {
		e.printStackTrace();
	   }
		fileWriter.println("Name of the book:" + book);
		fileWriter.println("Name of Author:" + author);
		fileWriter.println("Genre of book:" + genre);
		fileWriter.println("ISBN of book:" + isbn);
		fileWriter.println("Date of record:" + dateOfIssue);
		fileWriter.close();
		//Read text file
		Scanner fileReader = null;
		fileReader = new Scanner(book + ".txt");
		int lineNumber = 0;
		
		while (fileReader.hasNextLine()) {
			lineNumber++;
			System.out.printf("Line %d: %s%n",
			lineNumber, fileReader.nextLine());
			}
		fileReader.close();
	}

}
