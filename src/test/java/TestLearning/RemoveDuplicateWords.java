package TestLearning;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

String sentence = "Java is a programming Language and Java language is easy programming";
        
        String[] words = sentence.split("\\s+"); // Split by space
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
//        	uniqueWords.add(word); // Optional: ignore case
            uniqueWords.add(word.toLowerCase()); // Optional: ignore case
        }

        // Join the unique words back into a sentence
        String result = String.join(" ", uniqueWords);
        System.out.println(result);							//java is a programming language and easy


	}

}
