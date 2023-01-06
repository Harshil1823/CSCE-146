import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Harshil Shah
 */
public class ShapeTreeFE{
	
	public static void main(String [] args) throws IOException {
		
		ShapeTree i = new ShapeTree();
		
		System.out.println("Enter anything besides end to run the program.");
		Scanner kb = new Scanner(System.in);
		String userAnswer = kb.nextLine();
		
		while(!userAnswer.equalsIgnoreCase("end")) {
		
			System.out.println("What file do you want me to read? Enter the name of the file.");
			System.out.println("Enter shapeFile.txt to run that file.");
			String userInput = kb.nextLine();

	    //Create an object of the BufferedReader to read the file.
	    BufferedReader objReader = null;
	    objReader = new BufferedReader(new FileReader(userInput));
	   
	    String line;
		
	    while ((line = objReader.readLine()) != null)
	    {
	            int valid = 0;
	           
	            //Split the line by tab.
	            String words[] = line.split("\t");
	           
	            //Check the first word and create an object of the same class.
	            if(words[0].equals("Rectangle"))
	            {
	                  valid = 1;
	                  try
	                  {
	                        i.insert(new Rectangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
	                  }
	                  catch(Exception e)
	                  {
	                        System.out.println("Not valid");
	                  }
	            }
	           
	            else if(words[0].equals("Right Triangle"))
	            {
	                  valid = 1;
	                  try
	                  {
	                        i.insert(new Triangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
	                  }
	                  catch(Exception e)
	                  {
	                        System.out.println("Not valid");
	                  }
	            }
	           
	            else if(words[0].equals("Circle"))
	            {
	                  valid = 1;
	                  try
	                  {
	                        i.insert(new Circle(Double.parseDouble(words[1])));
	                  }
	                  catch(Exception e)
	                  {
	                        System.out.println("Not valid");
	                  }
	            }
	           
	            else
	            {
	                  System.out.println("Not valid");
	            }
	           
	            //Print the line read if the line is valid.
	            if(valid == 1)
	            {
	                  for(String word:words)
	                  {
	                        System.out.print(word+"\t");
	                  }
	                  System.out.println();
	            }
	    }
	    objReader.close();
	    System.out.println();
	   
	    //Call the methods 
	        i.preorder();
	        System.out.println();
	        i.inorder();
	        System.out.println();
	        i.postorder();
	        System.out.println();
	       
	        //Call the method to find the maximum area.
	        System.out.println("The max area is: "+i.maxArea());
	        System.out.println();
	       
	        
	        //Call the method to delete a rectangle of area 
	        i.delete("Rectangle", 14);
	        System.out.println();
	       
	        //Print the in-order of the tree.
	        i.inorder();
	        System.out.println();
	       
	        //Call the method to delete all the nodes greater than 30 and print the in-order of the tree.
	        i.deleteGreaterThan(30);
	        i.inorder();
	     
	        System.out.println("\nWould you like to run any other files?"
	        		+ "\n If yes. then enter Yes.");
	        System.out.println("if you want to end the program enter end");
	        String userA = kb.nextLine();
	        
	        if(userA.equalsIgnoreCase("end")) {
	        	break;
	        }
	        
		}//end of while loop
		
		System.out.println();
		System.out.println("You have ended the program!!!!");
	}
	
}