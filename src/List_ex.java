package practice;

import java.util.LinkedList;
import java.util.List;

public class List_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> list=new LinkedList<Integer>();
    list.add(1);
    list.add(12);
    list.add(23);
    System.out.println(list.get(2));
    System.out.println(list.indexOf(23));
    System.out.println("list the elementd:"+list);
    
	}

}
