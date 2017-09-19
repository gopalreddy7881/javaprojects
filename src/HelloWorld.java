package practice;

import java.util.HashSet;

public class HelloWorld {

	public static void main(String[] args) {
		String[] str={"gopal","gopal","raju","chandu","gopal","chandu","chandu"};
		HashSet <String> set=new HashSet<String>();
		for(String argments:str)
		{
			if(!set.add(argments))
			{
				System.out.println(argments);
			}
		}

}
	
}
