import java.util.Scanner;
public class SortFE {

	public static void main(String[] args) {
		
		SortSorter s = new SortSorter();
		
		System.out.println("Enter 1 to start the pogram.");
		Scanner kb = new Scanner(System.in);
		String userAnswer = kb.nextLine().toLowerCase();
		
		while(!userAnswer.equals("quit"))
		{
			s.Greeting();
			s.sort();
			s.print();
			

			System.out.println("would you like for me to sort something else? If so then enter anything besides quit."
					+ "\nIf you want to end the program then enter quit.");
			String userInput = kb.nextLine().toLowerCase();
			if(userInput.equals("quit")) {
				break;
			}
		}
		
	}

	
	
}
