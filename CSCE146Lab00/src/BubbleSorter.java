/*
 * Written by <<Harshil Shah>>
 */
//Packages
import java.util.Scanner;
import java.util.random.*;



//Do not alter-----------------------------------------------
public class BubbleSorter {
	
	public static final int Array_Size = 10;
//-----------------------------------------------------------
	
//Do not alter-----------------------------------------------
	public static void main(String[] args) {
//-----------------------------------------------------------
	
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter " + Array_Size  + " numbers and I'll sort them for you");
		int[] array = new int[Array_Size];
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter an value " + i);
			array[i]=Keyboard.nextInt();
		}
		
		//bubble sort
		boolean hasSwapped = true;
		while(hasSwapped) 
		{
			hasSwapped = false;
		for(int i=0; i<array.length-1;i++)
		{
			if(array[i]>array[i+1]) 
			{
				//swap
				int temporary = array[i];
				array[i] = array[i+1];
				array[i+1] = temporary;
				hasSwapped = true;
			}
		}//end of for loop
		
		}//end on while loop
		
		//print the sorted array
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}//Do not alter

}//Do not alter




