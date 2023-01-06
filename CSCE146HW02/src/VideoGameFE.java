/*
 * Harshil Shah
 */
import java.util.Scanner;

public class VideoGameFE {

	public static void main(String args[])  {
	
		Scanner kb = new Scanner(System.in);
		
		VideoGameBackEnd games = new VideoGameBackEnd();
		
		System.out.println("Welcome to the game data base");
		boolean endProgram = false;
		

		
        GenLL<VideoGame> curSearch= new GenLL<VideoGame>();
		
        while(!endProgram)
        {
        System.out.println("Enter 1 to load the video game database"
                + "\nEnter 2 to search the database"
                + "\nEnter 3 to print the current results"
                + "\nEnter 4 to print current results to file"
                + "\nEnter 5 to quit");
        int input = kb.nextInt();
        kb.nextLine();
        
        switch(input) {
        	case 1:
        		System.out.println("Enter file Name");
        		String file = kb.next();
        		games.readFromFile(file);
        		break;
        	case 2:
        		System.out.println("Enter the name of the game(if U know) or "
        				+ "\'*\' for all names");
        		String name = kb.nextLine();
        		System.out.println("Enter the name of the Console(if U know) or "
        				+ "\'*\' for all names");
        		String console = kb.nextLine();
        		games.search(name, console, games.list).print();;
        		
        		curSearch = games.search(name, console, games.list);
        		break;
        	case 3:
        		curSearch.print();
        		break;
        	case 4:
        		System.out.println("Enter file name");
        		String userFile = kb.nextLine();
        		System.out.println("Do you want to append or overwrite?"
        				+ "\n if append then enter true. If you want to overwrite your last results"
        				+ "then enter false. ");
        		boolean append = kb.nextBoolean();
        		kb.nextLine();
        		games.writeToFile(userFile, append, curSearch);
        		break;
        	case 5:
        		endProgram = true;
        		System.out.println("BYEEEE");
        		break;
        }
        }//end of while loop
	}//main method
}//main method
