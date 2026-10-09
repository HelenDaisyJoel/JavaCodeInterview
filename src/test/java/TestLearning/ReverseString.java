package TestLearning;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.next();
		StringBuilder sb=new StringBuilder(name);
		
		String ReversedString= sb.reverse().toString();
		System.out.println(ReversedString);
		

	}

}
