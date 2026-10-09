package TestLearning;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {12,43,2,65,78};
		int[] rev=new int[a.length];
		int index=0;
		
		for(int i=a.length-1;i>0;i--, index++) {
			
			rev[index]=a[i];
			
		}
		System.out.println(Arrays.toString(rev));
		for(int x=0;x<rev.length;x++) {
			System.out.print(rev[x] + " , ");
		}
	}

}
