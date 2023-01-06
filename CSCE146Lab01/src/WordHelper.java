/*
 * 
 * Harshil Shah
 * 
 
 */
public class WordHelper {
	
	//take in array of string via parameter
	//sorts from smallest to largest number of vowels
	
	public static String[] sortByVowels(String[] words)
	{
		//creating copy of the string array parameter
		// Create an array String[] of same size as words[]
		String[] vowelWords = new String[words.length];
		
		//move every word from that to this array we just created
		for(int i=0; i<words.length;i++) {
			vowelWords[i] = words[i];
		}
		
		//Sort the copied array and return it
		boolean hasSwapped = true;
		while(hasSwapped == true)
		{
			hasSwapped = false;
			for(int i = 0; i<vowelWords.length-1; i++)
			{
				if(numVowels(vowelWords[i]) > numVowels(vowelWords[i+1]))
				{
					String temp = vowelWords[i];
					vowelWords[i] = vowelWords[i+1];
					vowelWords[i+1] = temp;
					hasSwapped = true;
				}
			}
		} 
		
		return vowelWords;
	}
	
	public static int numVowels(String words)
	{
		int numVowel=0;
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i) == 'a'||words.charAt(i) == 'e'||words.charAt(i) == 'i'||words.charAt(i) == 'o'||words.charAt(i) == 'u')
			{
				numVowel++;
			}
			
		}
		return numVowel;
	}
	
	public static String[] sortByConsonants(String[] words)
	{
		String[] cWords = new String[words.length];
		
		for(int i=0; i<words.length; i++) {
			cWords[i] = words[i];
		}

		//sort the copied array and let's return it
		boolean hasSwapped = true;
		while(hasSwapped == true)
		{
			hasSwapped = false;
			for(int i = 0; i<cWords.length-1; i++)
			{
				if(numConsonants(cWords[i]) > numConsonants(cWords[i+1]))
				{
					String temp = cWords[i];
					cWords[i] = cWords[i+1];
					cWords[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		return cWords;
	}
	
	public static int numConsonants(String Words) {
		int numConsonants=0;
		if(numConsonants != 'a' || numConsonants != 'e' || numConsonants != 'i' ||numConsonants != 'o' || numConsonants != 'u'){
			numConsonants++;
		}
		return numConsonants;
	}
	
	public static String[] sortByLength(String[] words) {
		{
			String[] lWords = new String[words.length];
			for(int i = 0; i<words.length; i++)
			{
				lWords[i] = words[i];	
			}
			boolean hasSwapped = true;
			while(hasSwapped == true)
			{
				hasSwapped = false;
				for(int i = 0; i<lWords.length-1; i++)
				{
					if(lWords[i].length()>lWords[i+1].length())
					{
						String temp = lWords[i];
						lWords[i] = lWords[i+1];
						lWords[i+1] = temp;
						hasSwapped = true;
					}
				}
			}
			return lWords;
		}
	}
		
		
}
