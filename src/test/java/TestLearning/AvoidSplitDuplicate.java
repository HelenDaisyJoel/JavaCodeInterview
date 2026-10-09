package TestLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class AvoidSplitDuplicate {
	public static void main(String[] a) {
		 String sentence = "Java is a programming Language and Java language is easy programming";
		
		StringTokenizer token=new StringTokenizer(sentence);
		Set<String> unique=new LinkedHashSet<>();
		
		while(token.hasMoreTokens()) {
			unique.add(token.nextToken().toLowerCase());
		}

		String result = String.join(" ", unique);
        System.out.println(result);  // Output: java is a programming language and easy

		
		
		
	}

}
