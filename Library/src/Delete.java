import java.io.File;
import java.util.Scanner;

public class Delete {
	public void deletingFile(){
		System.out.println("Enter the book you wanna delete");
		Scanner input = new Scanner(System.in);	
		String file;
		file = input.nextLine();
		String fileName = file + ".txt";
		File f = new File(fileName);
	
		 if (!f.exists())
		 throw new IllegalArgumentException(
		"Delete: no such file or directory: " + fileName);
	
		 if (!f.canWrite())
		 throw new IllegalArgumentException("Delete: write protected: "
			          + fileName);
	
		if (f.isDirectory()) {
		String[] files = f.list();
		if (files.length > 0)
		throw new IllegalArgumentException(
			"Delete: directory not empty: " + fileName);
		    }
		
		    boolean success = f.delete();

		    if (!success)
		      throw new IllegalArgumentException("Delete: deletion failed");
		  }
}
