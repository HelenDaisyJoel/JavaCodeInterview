package TestLearning;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String word="Java is a programming Language";
		
		String[] arr=word.split(" ");
		for(String w: arr) {
			StringBuilder sb=new StringBuilder(w);
			String ReversedString= sb.reverse().toString();
			System.out.print(" ");
			System.out.print(ReversedString);			// avaJ si a gnimmargorp egaugnaL
		}
		
		

	}

}
