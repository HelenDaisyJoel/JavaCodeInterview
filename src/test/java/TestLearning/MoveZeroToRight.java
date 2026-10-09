package TestLearning;

import java.util.Arrays;

public class MoveZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,67,0,2,59,0,17};
		int size=array.length;
		int result[]= new int[array.length];
		int index=0;
		
		// Traverse from right to left and move non-zero elements to first
		for(int i=0; i<array.length;i++) {
			if(array[i]!=0) {
				result[index++]=array[i];
			}
		}
			
		
		System.out.println(Arrays.toString(result));

	}

}
