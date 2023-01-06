import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Harshil Shah
 */


	
	public class FileIOSolutions {

		public static void pastTense(String file, String newFile) {
			try {
				Scanner fileReader = new Scanner(new File(file));//creates scanner to read file.
				//printwriter to write in new file.
				PrintWriter fileWriter = new PrintWriter(new FileOutputStream(new File(newFile))); 
				while (fileReader.hasNext()) {//reads in word and than prints out to new file and console. 
					String tempWord = fileReader.next();
					if (tempWord.equalsIgnoreCase("is")) {
						System.out.println("was");
						//append text to the file
						fileWriter.println("Was");
					} else {
						System.out.println(tempWord);
						fileWriter.println(tempWord);
					}
				}
				//close the reader and writer 
				fileReader.close();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	
		
		
		public static double totalTubeVolume(String file) {
			double totalVolume = 0;
			
			try {
			Scanner reader = new Scanner(new File(file));
			//reading till file has data
			while(reader.hasNext()) {
				String wordArr[] = reader.nextLine().split("\t");
				double radius = Double.valueOf(wordArr[1]);
				double height = Double.valueOf(wordArr[2]);
				
				totalVolume += (Math.PI*radius*height);
			}
			reader.close();
			}catch(FileNotFoundException e) {
				System.out.println("File not found");
			}
			
			return totalVolume;
				
			}
			
	

}//Class
