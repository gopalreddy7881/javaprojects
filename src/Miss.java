package practice;

public class Miss {
	
	static void missing(int[] a,int first,int last)
	{
		for(int i=first;i<a[0];i++)
		{
			System.out.println(i);
		}
		for(int i=1;i<a.length;i++){
			for(int j=1+a[i-1];j<a[i];j++){
				System.out.println(j);
				
			}
		}
		for(int i=last;i<1+a[a.length-1];i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] a={1,2,3,4,6,7,8,9};
		missing(a,0,10);

	}

}
