package practice;
/*
public class FindMissingNumbersArray {
	static int sumofnumbers(int n){
		int sum=n*(n+1)/2;
		return sum;
	}
	static int sumofelements(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
	int n=8;
	int[] a={1,2,3,4,5,7};
	int sumofnumbers=sumofnumbers(n);
	int sumofelements=sumofelements(a);
	int missingnumber=sumofnumbers-sumofelements;
	System.out.println(missingnumber);
	}

}
*/



//Java program to find missing Number

class FindMissingNumbersArray
{
	// Function to ind missing number
	static int getMissingNo (int a[], int n)
	{
		int i, total;
		total = (n+1)*(n+2)/2; 
		for ( i = 0; i< n; i++)
		total -= a[i];
		return total;
	}
	
	// program to test above function 
	public static void main(String args[])
	{
		int a[] = {1,3,4,6,7,8,9,10};
		int miss = getMissingNo(a,8);
		System.out.println(miss); 
	}
}
