package TestLearning;

public class SwapStrings {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="World!";
		
		String str3=str1+str2;
		
//		str1=str1.substring(0,5);	// Hello
		str1=str3.substring(0,str1.length());	// Hello
		
		str2=str3.substring(str1.length(), str3.length());			//World!
		
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}

}
