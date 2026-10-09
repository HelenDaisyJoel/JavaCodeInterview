package TestLearning;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String word="Ja&^%va @@# is #2a!@#$pro4g6ram6ming$%+Lan:guage";
		
		
		String removeSpecialChar=word.replaceAll("[^a-zA-Z0-9]", "");		//JavaisaprogrammingLanguage
		System.out.println(removeSpecialChar);

	}

}
