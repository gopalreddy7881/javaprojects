package practice;

import java.util.HashMap;
import java.util.Scanner;

/*public class DuplicateCharinString {
	
	
	static void duplicateCharCount(String input){
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		char[] strArray=input.toCharArray();
		for(char c:strArray)
		{
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
			{
				h.put(c,1);
			}
		}
		
	Set<Character> set=h.keySet();
	System.out.println(input);
	for(Character ch:set)
		
	{
		if(h.get(ch)>1)
		{
			System.out.println(ch+"       "+h.get(ch));
			
		}
	}
	
		
		
	}

	public static void main(String[] args) {
		
		duplicateCharCount("javaj2ee");
		// TODO Auto-generated method stub
 
	}

}



*/
//Count all Charachets in given List
public class DuplicateCharinString {

    public static void main(String[] args) {
        //Create HashMap object to Store Element as Key and Value 
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        //Enter Your String From Console
        System.out.println("Enter an String:");
        //Create Scanner Class Object From Retrive the element from console to our java application
        Scanner sc = new Scanner(System.in);
        //Store Data in an string format
        String s1=sc.nextLine();
        //find the length of an string and check that hashmap object contain the character or not by using 
        //containskey() if that map object contain element only one than count that value as one or if it contain more than one than increment value 

        for(int i=0;i<s1.length();i++){
            if(!hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i),(Integer)1);
            }//if
            else{
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }//else

        }//for

        System.out.println("The Charecters are:"+hm);
    }//main
}//HashMapDemo
