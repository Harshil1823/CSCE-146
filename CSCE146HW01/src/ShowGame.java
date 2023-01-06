/*
 * Harshil Shah
 */

import java.util.Scanner;


public class ShowGame {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		ShowCase showcase = new ShowCase();
		
		while(true) {
			System.out.println("welcome to showcase program! "
					+ "\nYour 5 prizes are:  ");
			
			Prize [] randomPrizes = showcase.pick5RandomPrizes();
			double sumPrizeValue = 0;
			
			for (int i=0; i<randomPrizes.length; i++) {
				System.out.println(randomPrizes[i].getName());
				sumPrizeValue = sumPrizeValue + randomPrizes[i].getPrize();
			}
			
			System.out.println("You must guess the total of all prizes. If you are within 1000 range. You will win. ");
			int userEnteredValue = kb.nextInt();
			kb.nextLine();
			
			if(Math.abs(sumPrizeValue - userEnteredValue) <= 1000) {
				System.out.println("your guess of "+ userEnteredValue + " the actual price is "+ sumPrizeValue);
				System.out.println("your guess was under and you win. ");
			}
			else {
				System.out.println("you guessed "+ userEnteredValue + " the actual price is " + sumPrizeValue);
				System.out.println(" Sorry, but you lost! You can always play again. Better luck next time!");
			}
			
			System.out.println("Would you want to play again? Enter 1 to quit"
					+ " or else press any other number to continue playing.");
			int WantToPlay = kb.nextInt();
			
			if(WantToPlay == 1){
				System.out.println("BYEEEEEEE!");
				break;
			}
		}//end of while loop 
	}

}
