package TestLearning;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AvoidSpilitDuplicateMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Java is a programming Language and Java language is easy programming";
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sentence);

        Set<String> uniqueWords = new LinkedHashSet<>();

        while (matcher.find()) {
            uniqueWords.add(matcher.group().toLowerCase());
        }

        String result = String.join(" ", uniqueWords);
        System.out.println(result);  // Output: java is a programming language and easy


	}

}
