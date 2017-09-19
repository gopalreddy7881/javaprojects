package practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="gopal";
  System.out.println(recursive(s));
  // Using String Buffer
//  StringBuffer sb=new StringBuffer(s);
//  System.out.println(sb.reverse());
//  
  // Iterative model
 /* char[] str=s.toCharArray();
   for(int i=str.length-1;i>=0;i--){
	   System.out.print(str[i]);
   }
*/   
 // recursive method
   
	}


static String recursive(String str){
	if ((null == str) || (str.length() <= 1))
    {
           return str;
    }

    return recursive(str.substring(1)) + str.charAt(0);
}
}
