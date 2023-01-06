/*
 * Harshil Shah
 */
import java.util.Scanner;

public class RobotSimFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		RobotSimBackEnd robot = new RobotSimBackEnd();
		
		System.out.println("Hello."
				+ "\nWelcome to the robot simulator. ");
		
		boolean end = false;
		
		while(!end)
		{
			System.out.println("Input board file name: ");
			String fileName = kb.nextLine();
			System.out.println("NOW, please enter the robot COMMAND file name"); //get the command file from the user
			String secondFileName = kb.nextLine();
			
			
			System.out.println("BEEP...BOOOP PROCESSING THE SIMULTION");
			robot.printInitial(fileName); //call the robot object pass in the file name and run the method
			robot.mMOve(secondFileName);
			
			System.out.println("Enter end to exit the program or else enter \"NO\" to continue running simulation");
			String userInput = kb.nextLine();
			if(userInput.equalsIgnoreCase("end")) {
				System.out.println("BEEEP>>>>BYEEEE>BOOOOP");
				break;
			}
		}
	}
	
	
	
}
