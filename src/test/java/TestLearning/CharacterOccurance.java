package TestLearning;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	public static void main(String[] args) {
		String name="Helenn@0@y12 Dais!1ya!";
		
		Map<Character, Integer> map=new HashMap<>();
		for(char c: name.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		}
		
		for(Map.Entry<Character, Integer> entrymap: map.entrySet() ) {
//			System.out.println(map);		Never use like this
			System.out.println(entrymap.getKey() + " : " + entrymap.getValue());
			
		}
		
	}

}
