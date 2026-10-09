package TestLearning;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] a = {12, 43, 2, 65, 78};
		int temp;

		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a.length - 1; j++) {
		        if (a[j] < a[j + 1]) {
		            temp = a[j];
		            a[j] = a[j + 1];
		            a[j + 1] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(a));

		for (int num : a) {
		    System.out.print(num + " ");
		}

	}

}
