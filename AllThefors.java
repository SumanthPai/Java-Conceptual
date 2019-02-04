import java.util.*;
public class AllThefors {

	public static void main(String[] args) {
		/*
Write a program to print 10 even numbers and 10 odd numbers.
Write a program to find factorial of a number.
Write a program to generate tables of 10.
Write a program to add the digits of a number.
Write a program to reverse the digits of a number.
Write a program to generate 10 Fibonacci numbers*/
		
//1.
		int limit = 20;
		
		System.out.println("Printing Odd numbers between 1 and " + limit);
		
		for(int i=1; i <= limit; i++){
			
			//if the number is not divisible by 2 then it is odd
			if( i % 2 != 0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n \n Printing even numbers between 1 and " + limit);
		for(int i=1; i <= limit; i++){
			if(i%2==0) {
				System.out.println(i + " ");
			}
		}
		
	//2.
		int n, c, fact = 1;
	     
	      System.out.println("Enter an integer to calculate it's factorial");
	      Scanner in = new Scanner(System.in);
	     
	      n = in.nextInt();
	     
	      if (n < 0)
	         System.out.println("Number should be non-negative.");
	      else
	      {
	         for (c = 1; c <= n; c++)
	            fact = fact*c;
	     
	         System.out.println("Factorial of "+n+" is = "+fact);
	      }
		in.close();
		
		
		//3.
		System.out.println("Enter the number for its multiplicative table");
		Scanner scnn = new Scanner(System.in);
		int mult = scnn.nextInt();
		for(int mt = 1; mt<=10;mt++) {
			
			System.out.println(mult+" Xs"+mt+"="+(mult*mt));
		}
		scnn.close();
		
		//4. 
		int num, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        temp = num;
		
        for(sum = 0; num>0 ; num =num/10)
        {
            rem = num%10;
            sum = sum+rem;
            
        }
		
        System.out.print("Sum of Digits of " +temp+ " is " +sum); 
        scan.close();
        
        //5.
        int numbrev = 1234567, reversed = 0;

        for(;numbrev != 0; numbrev /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
        
        
        //6.
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
		

   }
}
