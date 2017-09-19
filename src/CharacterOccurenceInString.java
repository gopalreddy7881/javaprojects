package practice;

import java.util.Scanner;

public class CharacterOccurenceInString {

	public static void main(String args[]){
		System.out.println("enter the string");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			char c='e';
			int count = s.length() - s.replace("e", "").length();
			 
	        System.out.println(count);
	    

	}

}
