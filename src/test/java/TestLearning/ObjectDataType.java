package TestLearning;

public class ObjectDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj[][]= {{1,2,"Helen", true},{3,4, "Daisy", false}};
		
		for(Object[] a: obj) {
			for(Object item: a) {
				System.out.print(item+ "  ");	
			}
			System.out.println();
		}
		
}

}
