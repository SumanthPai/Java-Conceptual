import java.util.*;
public class AllTheWhiles {

	public static void main(String[] args) {
		/*Write a program to print 10 even num
		bers and 10 odd numbers.
		
		Write a programto find factorial of a number.
		
		Write a program to generate tables of 10.
		
		Write a programto add the digits of a number.
		
		Write a program to reverse the digits of a number.
		
		Write a program to generate 10 Fibonacci numbers.*/

		
		
		//1
		
		int i = 1;
		System.out.println("First 10 odd numbers using while : \n");
		while(i<=10) {
		if( i % 2 != 0){
			System.out.print(i + " ");
			
		}
		i++;
		}
		int j=1;
		System.out.println("First 10 even numbers using while : \n");
		while(j<=10) {
			
			if(j%2==0)
			{
				System.out.println(j + " ");
				
				
				}
			j++;
			}
		
		//2. 
		
		int number=5;
		int fact = 1;
		int c=1;
		
		while(c<=number) {
			
			fact = fact *c;
			
			c++;
		}
		System.out.println("The factorial of a number : "+ fact);
		
		
		//3
		
		
		 int numbberr = 9, inter = 1;
	        while(i <= 10)
	        {
	            System.out.printf((numbberr*inter+"\n"));
	            i++;
	        }
		
		
		
		
		
		//4.
		int numberz, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        numberz = scan.nextInt();
		
        temp = numberz;
        sum=0;
		
        while( numberz>0)
        {
            rem = numberz%10;
            sum = sum+rem;
            numberz = numberz /10;
            
        }
		
        System.out.print("Sum of Digits of " +temp+ " is " +sum); 
        scan.close();
        
		//5.
        int numbrev = 1234567, reversed = 0;

        while(numbrev != 0 ) {
            int digit = numbrev % 10;
            reversed = reversed * 10 + digit;
            numbrev /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        
        
        
        //6.
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");
        int inm =1 ;
        while (  inm <= count)
        {
            System.out.print(num1+" ");

            
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            ++inm;
        }
		
		
		
		
		
	}

}
