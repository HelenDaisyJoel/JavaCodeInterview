package TestLearning;

import java.util.HashMap;
import java.util.Map;

public class numberOccurance {

	public static void main(String[] args) {
		int[] array= {12,3,12,56,56,3,3,65, 9};
		Map<Integer, Integer> map = new HashMap<>();

		for (int c : array) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}
System.out.println(map);
	}

}
