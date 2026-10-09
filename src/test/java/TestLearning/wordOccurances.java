package TestLearning;

import java.util.HashMap;
import java.util.Map;

public class wordOccurances {

	public static void main(String[] args) {
		 String sentence = "Java is a programming Language and Java language is easy programming";
		 String[] sen=sentence.split(" ");
		 Map<String, Integer> map=new HashMap<>();
		 for(String s:sen) {
			
			 map.put(s, map.getOrDefault(s, 0)+1);
			 
		 }
		 System.out.println(map);
	}

}
