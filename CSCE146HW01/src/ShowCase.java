/*
 * Harshil Shah
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ShowCase {
	
	private Prize prizes[];
	
	//constructor
	public ShowCase() {
		prizes = new Prize[300];
		readFromFile();
		
	}
	
	
	public void readFromFile() {
		
		try {
			//using relative path to access the file in project directory 
			BufferedReader bufferedReader = new BufferedReader(new FileReader("./prizeList.txt"));
			 String curLine;
			 int total = 0;
			 
	        while ((curLine = bufferedReader.readLine()) != null){
	        	if(!curLine.trim().equals("")) {
	        		String input [] = curLine.split("\\s+");
	        		
	        		String nameOfPrize = input[0]+ " ";
	        		for(int i=0; i<input.length -1;i++) {
	        			nameOfPrize = nameOfPrize + input[i] + "";
	        		}
	        		double prizeValue = Double.parseDouble(input[input.length - 1]);
	        		prizes [total++] = new Prize(nameOfPrize, prizeValue);
	 
	        	}
	        	if(total == 300) {
	        		break;
	        	}
	            
	        }
	        bufferedReader.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}//end of redFromFile method 
	
	
	public Prize[] pick5RandomPrizes() {
		
		int j;
		
		Prize randomPrizes[] = new Prize[5];
		Random rand = new Random();
		for(int i=0; i<5; i++) {
			Prize randomPrize;
			while(true) {
				
				j = rand.nextInt(50) % 50;
				randomPrize = prizes[j];
				boolean ifExist = false;
				
				for(int k=0; k<randomPrizes.length;k++) {
					Prize prize = randomPrizes[k];
					if(prize != null) {
						if(randomPrize.getName().equalsIgnoreCase(prize.getName())) {
							ifExist = true;
						}
					}
				}
				
				if(!ifExist) {
					break;
				}
			}
			randomPrizes[i] = randomPrize;
		}
		return randomPrizes;
		
		
	}
	
	
}//end of class
