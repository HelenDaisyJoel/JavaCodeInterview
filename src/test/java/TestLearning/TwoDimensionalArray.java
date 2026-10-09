package TestLearning;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{23,12,3,5,6},{21,32,43,54,6},{2,4,5,98,56}};
		
		for(int[] x:a) {				//Rows of the array
			for(int y:x) {				//Columns of the array
				System.out.print(y+ " ");
			}
			System.out.println();
		}

	}

}
