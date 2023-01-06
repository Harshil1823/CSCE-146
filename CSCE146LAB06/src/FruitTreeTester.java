import java.util.Scanner;
import java.io.*;
/*
 * Harshil Shah
 */
public class FruitTreeTester {

	public static void main(String[] args) {

		LinkedBST<Fruit> tree = new LinkedBST<Fruit>();//Creates tree
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to fruit tree!Please enter a fruit file Name that you want me to read:");
		String fileName = kb.nextLine();
		System.out.println("Processing tree file");
	
		
		//read from a file
		try
		{
			Scanner file = new Scanner(new FileReader(fileName));//Sets fileScanner
			while(file.hasNextLine())
			{
				String currLine = file.nextLine();//Creates currLine variable
				String[] splitLine = currLine.split("\t");//Tab delimeter
				if(splitLine.length == 2)
					tree.add(new Fruit(splitLine[0],Double.parseDouble(splitLine[1])));
			}
		}
		catch(Exception e)
		{
			System.out.println("SOMEHTING WENT WRONG");
		}
		
		System.out.println("Printing the in-order traversal: ");
		tree.printInorder();
		System.out.println("\nPrinting the pre-order traversal: ");
		tree.printPreorder();
		System.out.println("\nPrinting the post-order traversal: ");
		tree.printPostorder();
		System.out.println("\nDeleting Apple 0.4859853412170728");
		tree.remove(new Fruit("Apple", 0.4859853412170728));
		System.out.println("\nPrinting in-order traversal: ");
		tree.printInorder();

		
		
	}
}
