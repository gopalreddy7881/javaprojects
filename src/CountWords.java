package practice;

import java.util.Scanner;

public class CountWords {
@SuppressWarnings("resource")
public static void main(String args[]){
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] words=s.trim().split(",");
	System.out.println("number of words"+words.length);
	
}
}
