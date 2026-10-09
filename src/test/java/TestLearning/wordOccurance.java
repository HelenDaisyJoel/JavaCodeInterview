package TestLearning;

import java.util.LinkedHashMap;
import java.util.Map;

public class wordOccurance {

	public static void main(String[] args) {
		String sentence = "Java is a programming Language and Java language is easy programming";
		
		String[] words=sentence.split(" ");
		
		Map<String, Integer> wordCount=new LinkedHashMap<String, Integer>();
		
		for(String word: words) {
			
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			System.out.print(word);
		}
		/*
		 if (wordCount.containsKey(word)) {
    wordCount.put(word, wordCount.get(word) + 1);
} else {
    wordCount.put(word, 1);
}

		 */
		System.out.print(wordCount);
		

	}

}
