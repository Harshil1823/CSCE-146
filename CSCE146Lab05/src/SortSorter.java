/*
 * Harshil Shah
 */
import java.util.Scanner;
public class SortSorter {
	
	private LLQueue <String> queue;
	private String[] array;
	private int [] RbCount;
	private int count;
	private String word;
	
	//constructor
	public SortSorter()
	{
		this.queue = new LLQueue<String>();
		this.count = 0;
		this.word = "sort";
	}
	
	public void sort()
	{
		array = new String[queue.size()]; //assign the size of Queue to array
		RbCount = new int [queue.size()]; //assignthe size of queue to rbcount
		for(int i=0; i<array.length;i++)
		{
			count = 0;
			array[i] = queue.dequeue();
			if(array[i].toLowerCase().contains(word)) {
				count += countOccurence(array[i].toLowerCase(), word);
				RbCount[i] = count;
			}else {
				System.out.println(array[i]);
			}
		}
	}

	public static int countOccurence(String lowerCase, String word2) 
	{
		int lastInd = 0;
		int count = 0;
		
		while(lastInd != -1)
		{
			lastInd = lowerCase.indexOf(word2, lastInd);
			if(lastInd != -1) {
				count ++;
				lastInd += word2.length();
			}
		}
		return count;
	}
	
	public void print(){
		
		quickSort(RbCount, 0, RbCount.length-1);
		for(int i=0; i<array.length;i++)
		{
			if(array[i].toLowerCase().contains(word)) {
				count += countOccurence(array[i].toLowerCase(), word);
				for(int j=0; j<RbCount.length;j++)
				{
					if(RbCount[j] == count)
					{
						System.out.println(array[i]);//TODO
						count = 0;
					}
				}
			
			}
		}
	}
	
	public static void quickSort(int[] a, int start, int end)
	{
		if(start >= end) {
			return;
		}
		int pivot = partition(a, start, end);
		quickSort(a, start, pivot-1); //left hand side
		quickSort(a, pivot+1, end); //right hand side
	}
	public static int partition(int[]a, int start, int end)
	{
		int pivot = a[end];
		int i = start;
		for(int j=start; j<end; j++){
			if(a[j] < pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		int temp = a[i];
		a[i] = a[end];
		a[end] = temp;
		return i; //at the end correspnodes to the value of i
	}
	
	public void Greeting()
	{
		System.out.println("Welcome. Enter any number of strings and I will solve it for you.");
		System.out.println("Once your done enter \"END\" And then I will sort it for you.");

		Scanner keyboard = new Scanner(System.in);
		boolean end = false;
		while(end == false)
		{
			String input = keyboard.nextLine();
			//keyboard.nextLine();
			if(input.equals("end"))
			{
				System.out.println("\n SORTED!!!");
				break;
			}
			else
			{
				queue.enqueue(input);
			}
		}
	}
	
}
