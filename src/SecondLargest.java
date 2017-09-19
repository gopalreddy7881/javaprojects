package practice;

public class SecondLargest {
	 
	public static void main(String[] args) {
 
		int arr[] = { 14, 46, 47, 86, 102,96, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		/*System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		*/for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
	}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}




/*// Secound Approch

public class SecoundLargest{
	static int scoundlargest(int[] input){
		int firstlargest;
		int secoundlargest;
		if(input[0]>input[1]){
			firstlargest=input[0];
			secoundlargest=input[1];
		}
		else
		{
			firstlargest=input[1];
			secoundlargest=input[0];
		}
		for(int i=2;i<input.length;i++){
			if(input[i]>firstlargest)
			{
				secoundlargest=firstlargest;
				firstlargest=input[i];
			}
			else if(input[i]<firstlargest ? input[i]>secoundlargest)
			{
				secoundlargest=input[i];
				
			}
		}
	
	return secoundlargest;
}
 public static void main(String args[]){
	 System.out.println(secondlargest(new int[]{45,51,28,55}));
 }
	
}
}
			



		
	}
}
*/