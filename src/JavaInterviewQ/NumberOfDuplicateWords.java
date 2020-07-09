package JavaInterviewQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumberOfDuplicateWords {

	//to find duplicate words in a string
	//hi test by test tool: test is duplicate twice
	
	public static void findDuplicateWords(String str) {
		
		//split will return string array
		
		String words[] = str.split(" "); 
		
		//create a Hashmap
		Map<String, Integer> wcount =  new HashMap<String, Integer>();		
		
		//To check each word in given array;
		
		for(String word:words) {
			//if word is present
			
			if(wcount.containsKey(word)) {
				
				wcount.put(word, wcount.get(word)+1);
			}
			else {
				wcount.put(word, 1);
			}
		}
		
		//to extract all keys from map  wcount
		Set<String> wordsInString = wcount.keySet();
		
		for (String word:wordsInString) {
			if(wcount.get(word)>1) {
				System.out.println(word + " : " + wcount.get(word));
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence to count Duplicate words: ");
		String input= sc.nextLine();

		findDuplicateWords(input);
		
	}

}
