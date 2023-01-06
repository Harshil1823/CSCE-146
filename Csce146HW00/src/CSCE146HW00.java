import java.util.Scanner;
import java.math.*;


public class CSCE146HW00 {

	public static void main(String[] args) {
		
		//get an input from the user -- use the kb
		Scanner kb = new Scanner(System.in);
		int userInput = 0;
		int vectorSize =0;
		double [] vectorOne;
		double[] vectorTwo;
		double magnitude = 0;
		
		System.out.println("Thanks for using my vector program to add, subtract, "
				+ "and find magnitude of your vectors");
		
		do {
			
			//what the program can do
			System.out.println("Enter 1 to add two vectors");
			System.out.println("Enter 2 to subtract two vectors");
			System.out.println("Enter 3 to find magnitude of two vectors");
			System.out.println("Enter 4 to quit the program");
			
			//get the input from the user and store it in here
			userInput = kb.nextInt();
			
			if(userInput == 1)
			{
				//let's add two Vectors.  
				System.out.println("Enter the size of the vectors(meaning components)");
				vectorSize = kb.nextInt();
				//see if the size is valid or not
				if(vectorSize <= 0) {
					System.out.println("You have entered invalid size");
				}else{
					//let's ask for the size of the 2 vectors 
					System.out.println("Enter values for vector 1");
					vectorOne = new double[vectorSize];
					for(int i=0; i<vectorSize;i++) {
						vectorOne[i]=kb.nextDouble();
					}
					//get value for vector 2
					System.out.println("Enter values for vector 2");
					vectorTwo = new double[vectorSize];
					for(int i=0; i<vectorSize; i++) {
						vectorTwo[i]=kb.nextDouble();
					}
					
					//result
					System.out.println("result: ");
					for(int i=0; i<vectorSize; i++) {
						System.out.println(vectorOne[i]);
					}
					
					System.out.println("+");
					
					System.out.println("result: ");
					for(int i=0; i<vectorSize; i++) {
						System.out.println(vectorTwo[i]);
					}
					
					System.out.println("=");
					
					//add vectors 
					for(int i=0; i<vectorSize;i++) {
						System.out.println(vectorOne[i]+vectorTwo[i]);
					}
					
				}//end of else
			}else if(userInput == 2){
				
				System.out.println("Enter the size of the vectors(meaning components)");
				vectorSize = kb.nextInt();
				if(vectorSize <0) {
					System.out.println("You have entered invalid size");
				}else {
					//get values for vector 1
					System.out.println("Enter values for vector 1");
					vectorOne = new double[vectorSize];
					for(int i=0; i<vectorSize;i++) {
						vectorOne[i]=kb.nextDouble();
					}
					//get value for vector 2
					System.out.println("Enter values for vector 2");
					vectorTwo = new double[vectorSize];
					for(int i=0; i<vectorSize; i++) {
						vectorTwo[i]=kb.nextDouble();
						}
					
					////result
					System.out.println("result: ");
					for(int i=0; i<vectorSize; i++) {
						System.out.println(vectorOne[i]);
					}
					
					System.out.println("-");
					
					System.out.println("result: ");
					for(int i=0; i<vectorSize; i++) {
						System.out.println(vectorTwo[i]);
					}
					
					System.out.println("=");
					
					//do subtraction 
					for(int i=0; i<vectorSize;i++) {
						System.out.println(vectorOne[i] - vectorTwo[i]);
					}	
				}//end of else				
			}//end of else if
			else if(userInput == 3){
				//Let's do the magnitude
				System.out.println("Enter the size of the vectors(meaning components)");
				vectorSize = kb.nextInt();
				if(vectorSize <= 0){
					System.out.println("you have entered invalid size");
				}else {
					//value for vector 1
					System.out.println("Enter values for vector 1");
					vectorOne = new double[vectorSize];
					for(int i=0; i<vectorSize;i++) {
						vectorOne[i]=kb.nextDouble();
					}
					
					//come back and figure out how to find magnitude
					for(int i=0; i<vectorSize;i++) {
						magnitude += vectorOne[i] * vectorOne[i];
						//magnitude = Math.sqrt(magnitude);
						//System.out.println("Magnitude is " + magnitude);
					}
					magnitude = Math.sqrt(magnitude);
					System.out.println("Magnitude is " + magnitude);
				}//end of else
			}//end of else if
			else if(userInput == 4) {
				System.out.println("BYEEEEEEEE!");
			}
			
		}while(userInput != 4);
		
	}//Main

}//Classs
