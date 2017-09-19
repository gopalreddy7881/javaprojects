package practice;

import java.util.HashSet;

public class FindComElimtsTwoString {

	public static void main(String[] args) {
		String[] s1={"one","two","three"};
		String[] s2={"one","three","four"};
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					set.add(s1[i]);
				}
			}
		
		System.out.println(set);
		}
		
		
	}

}
