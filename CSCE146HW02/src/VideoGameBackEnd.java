/*
 * Harshil Shah
 */
import java.util.Scanner;
import java.io.*;

public class VideoGameBackEnd {

	public static final String DELIM="\t";
	
	//creating GenLL of videoGame so you can use functionality of GenLL like add, remove, etc..
    GenLL<VideoGame> list = new GenLL<VideoGame>();

	public void readFromFile(String file) {
		
		try 
		{
			Scanner reader = new Scanner(new File(file));
			while(reader.hasNextLine()) 
			{
				String fileLine = reader.nextLine();
				String[] splitLine = fileLine.split(DELIM); // splitting the line that I just read
				if(splitLine.length == 2) {
					VideoGame newGame = new VideoGame();
					newGame.setName(splitLine[0]);
					newGame.setConsole(splitLine[1]);
					
				}
			}
			reader.close(); //make sure not data leak
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}//end of readFromFile
	
	
	public void writeToFile(String file, boolean append, GenLL list) {
		try 
		{
			list.reset();
			PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
			while(list.hasMore()) {
				printWriter.print(list.getCurrent().toString());
				list.goToNext();
			}
			printWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public GenLL search(String Name, String Console, GenLL list) {
		
        GenLL<VideoGame> srchResults= new GenLL<VideoGame>();

		list.reset();
		while(list.hasMore()) 
		{
			if(Name.equalsIgnoreCase("*") && Console.equalsIgnoreCase("*")) {
				srchResults = list;
			}
			else if(Name.equalsIgnoreCase("*")) {
				String [] same = list.getCurrent().toString().split(DELIM);
				
				
				if(same[0].contains(Console)){
                    if(same.length== 2){
                    VideoGame newGame= new VideoGame();
                    newGame.setName(same[0]);
                    newGame.setConsole(same[1]);
                    srchResults.add(newGame);
                    }
                    
				}
				list.goToNext();
			}
			else if(Console.equalsIgnoreCase("*")) {
				
				String [] same = list.getCurrent().toString().split(DELIM);
				
				if(same[1].contains(Console)){
                    if(same.length== 2){
                    VideoGame newGame= new VideoGame();
                    newGame.setName(same[0]);
                    newGame.setConsole(same[1]);
                    srchResults.add(newGame);
                    }
                    
				}
				list.goToNext();
			}
			else{
				String [] same = list.getCurrent().toString().split(DELIM);
				if(same[1].contains(Console) && same[0].contains(Name)) {
					if(same.length == 2) {
	                    VideoGame newGame= new VideoGame();
	                    newGame.setName(same[0]);
	                    newGame.setConsole(same[1]);
	                    srchResults.add(newGame);
					}
				}
				list.goToNext();
			}
		
		}//end of while
		
		return srchResults;

	}//end of the method
	
	
}//class
