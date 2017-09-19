package practice;

import java.util.Scanner;

public class BinaryToDecimal
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
         
        System.out.println("Enter The Decimal Number : ");
         
        int inputNumber = sc.nextInt();
         
         
        int copyOfInputNumber = inputNumber;
         
        //Initializing binary to empty string
         
        String binary = "";
         
        //Defining rem to store remainder
         
        int rem = 0;
         
        //See the below explanation to know how this loop works
         
        while (inputNumber > 0)
        {
            rem = inputNumber % 2;
             
            binary =  rem + binary;
             
            inputNumber = inputNumber/2;
        }
         
        System.out.println("Binary Equivalent of "+copyOfInputNumber+" is "+binary);
    }
}