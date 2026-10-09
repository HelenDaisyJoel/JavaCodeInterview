package TestLearning;

import java.util.HashMap;
import java.util.Map;

public class vowelsOccurance {
	public static void main(String[] args) {
	String text = "automation testing";

	Map<Character, Integer> map = new HashMap<>();

	for (char c : text.toCharArray()) {
	    if ("aeiou".indexOf(c) != -1) {
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }
	}

	System.out.println(map);
	}
}
