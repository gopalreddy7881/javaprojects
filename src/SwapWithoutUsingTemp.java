package practice;

import java.util.Scanner;

public class SwapWithoutUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*System.out.println("enter the first string");
	Scanner sc =new Scanner(System.in);
	String s1=sc.nextLine();
	System.out.println("enter the secound string");
	Scanner sc2 =new Scanner(System.in);
	String s2=sc2.nextLine();
	*/
		String s1="gopal";
	String s2="reddy";
	
	s1=s1+s2;
	s2 = s1.substring(0, s1.length()-s2.length());
    
    s1 = s1.substring(s2.length());
    System.out.println(s1);
    System.out.println(s2);
     
	
	
	}

}
