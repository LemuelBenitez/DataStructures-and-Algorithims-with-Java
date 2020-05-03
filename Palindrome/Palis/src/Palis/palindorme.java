package Palis;
import java.util.*;


public class palindorme {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word: ");
		do {
			String lem = scnr.nextLine();
			System.out.println(palindrome(lem));
			System.out.println();
			System.out.println("Enter another word: ");
		}while(true); 
	       }
	
	
	public static boolean palindrome(String x) {
		Stack s1 = new Stack(12);
		String str1 = "";
		
		for(int i = 0; i<x.length(); i++) {
			System.out.println(x.charAt(i));
			s1.push(x.charAt(i));
		}
		while(!s1.isEmpty()){
			str1 += s1.top();
			s1.pop();	
		}
		System.out.println("Spelt backwards is: " + str1);
		if(str1.contentEquals(x)) {
			return true;
		}else {
	    System.out.print("Is this word a palindrome: ");
		return false;
		}
	}
}

