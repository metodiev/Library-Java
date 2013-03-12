import java.util.Scanner;


public class Librarian {
	public static void main(String[] args){
		
		int choice;
		do{
		System.out.println("\tMenu:");
		System.out.println("1. Enter new book");
		System.out.println("2. Search in library for book");
		System.out.println("3. Delete book");
		System.out.println("4. Exit of menu");
		
		Scanner menu = new Scanner(System.in);
		choice = menu.nextInt();
		}while(!((choice<=4) && (choice>=1)));
		
		switch (choice){
		case 1: Book book = new Book();
				book.getBook();
				book.getAuthor();
				book.getGenre();
				book.getIsbn();
				book.getDate();
				DataLibrary libraryData = new DataLibrary();
				libraryData.recordingData(book.nameOfBook, book.authorOfBook, book.genre, book.isbn, book.date);
				break;
		case 2: SearchInLibrary search = new SearchInLibrary();
				search.searchInFile();
				break;
		case 3: Delete deleteFile = new Delete();
				deleteFile.deletingFile(); break;
		case 4: System.out.println("Exit...");  break;
		default: System.out.println("Wrong choice try again"); break;
		}
	}	
}
