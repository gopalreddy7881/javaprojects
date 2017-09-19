package practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteretor_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<String> l=new LinkedList<String>();
    l.add("gopal");
    l.add("mansur");
    l.add("nag");
    l.add("mahesh");
    ListIterator<String> ltr=l.listIterator();
    while(ltr.hasNext())
    {
    	String s=(String)ltr.next();
        
    	System.out.println(s);
    	if(s.equals("nag"))
    	{
    		ltr.set("teja");
    	}
    	else if(s.equals("mansur"))
    	{
    		ltr.remove();
    	}
    }
    System.out.println(l);
  
	}

	/*@Override
	public String toString() {
		return "ListIteretor_ex [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
*/
}
