package practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Vector v=new Vector();
		ArrayList list=new ArrayList<>();
  for(int i=0;i<=10;i++)
  {
	 // v.addElement(i);
	  list.add(i);
  }
 // Enumeration<Integer> e=v.elements();
  Iterator<Integer> itr=list.iterator();
  
  //while(e.hasMoreElements())
  while(itr.hasNext()){
	 Integer I=(Integer)itr.next();
	 if(I%2==0)
	 {
		 System.out.println(I);
	 }
	 else
		 itr.remove();
	  }
  System.out.println("----------------");
  System.out.println(list);

	}
	

}
