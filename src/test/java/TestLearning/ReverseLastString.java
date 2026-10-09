package TestLearning;

public class ReverseLastString {

	public static void main(String[] args) {
		String sentence = "Java is a programming Language and Java language is easy programming";
		
		int lastWord=sentence.lastIndexOf(" ");
		System.out.println(lastWord);   				//56 is the space
		
		int indexOFLastG=sentence.lastIndexOf("g");
		System.out.println("Last Index of G:   "+indexOFLastG);   				//56 is the space
		
		int indexOFFirstG=sentence.indexOf("g");
		System.out.println("Last Index of G:   "+indexOFFirstG);   				//56 is the space
		
		
		
		String last= sentence.substring(lastWord+1);	// Just picking after 57
		System.out.println(last);						//programming
		
		
		String first= sentence.substring(0, lastWord+1);	// Just picking before 57
		System.out.println(first);						//Java is a programming Language and Java language is easy 
		
		System.out.println(first+ new StringBuilder(last).reverse());	
		

	}

}
