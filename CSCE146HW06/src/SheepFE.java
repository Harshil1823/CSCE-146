/*
 * Harshil Shah
 */

import java.util.Scanner;
import java.io.*;
public class SheepFE {
	
public static void main (String [] args)
	
	{
		try
		{
			String file;
			System.out.println("HELLO. -Sheep Shearing scheduler!");
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter the file you want me to read.");
			file = kb.nextLine();
			
			SheepHeap sheep = new SheepHeap();
			
			Scanner reader = new Scanner(new File(file));//reads the file that user passes in
			while(reader.hasNext()) //go until nothing is left
			{
				String name = reader.next();
				int sT = reader.nextInt(); //type T
				int aT = reader.nextInt();	
				sheep.add(new Sheep(aT, sT, name));
			}
			System.out.println("\nThe scheudle is: ");
			sheep.heapSort();
			sheep.print();
			reader.close(); //make sure not data leak
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	
	
	
	}

}
