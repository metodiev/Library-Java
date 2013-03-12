import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchInLibrary {
	private static String fileToSearch;
	
	public void searchInFile(){
		System.out.println("Enter the name of book you wanna search");
		System.out.println("Enter the name ");
		Scanner input = new Scanner(System.in);
		fileToSearch = input.nextLine();	
		String fileName;
		fileName = fileToSearch + ".txt";
		
		System.out.println("Do you wanna read all data for that book?");
		System.out.println("To read pres y");
		String temp, choice;
		choice = input.nextLine();
		 temp = "y";
		 File file = new File(fileToSearch + ".txt");
		 if (( (temp.equalsIgnoreCase(choice)))){
			 Scanner fileReader = null;
				try {
					fileReader = new Scanner(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				int lineNumber = 0;
				
				while (fileReader.hasNextLine()) {
					lineNumber++;
					System.out.printf("Line %d: %s%n",
					lineNumber, fileReader.nextLine());
					}
				fileReader.close();
		 }
		
		System.out.println("Enter word you wanna search");
		String enterSearchWord;
		Scanner word = new Scanner(System.in);
		enterSearchWord = word.nextLine();
		Scanner fileReader = null;
		int occurrences = 0;
		
		try {
		fileReader = new Scanner(new File(fileName));
		System.out.println("File " + fileName + " opened.");
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
			int index = line.indexOf(enterSearchWord);
			while (index != -1) {
			occurrences++;
			index = line.indexOf(enterSearchWord, (index + 1));
			}
		}
			}
		catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
			} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
			}
		finally {
			if (fileReader != null) {
			fileReader.close();
			}
			}
			System.out.printf("The word %s occurs %d times",
					enterSearchWord, occurrences);
		}

}
