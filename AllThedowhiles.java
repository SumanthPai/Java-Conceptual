import java.util.Scanner;
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
		 do{
		if( i % 2 != 0){
			System.out.print(i + " ");
			
		}
		i++;
		}while(i<=10);
		 
		 
		 
		 
		int j=1;
		System.out.println("First 10 even numbers using while : \n");
		do{
			
			if(j%2==0)
			{
				System.out.println(j + " ");
				
				
				}
			j++;
			}while(j<=10) ;
		
		//2. 
		
		int number=5;
		int fact = 1;
		int c=1;
		
		do {
			
			fact = fact *c;
			
			c++;
		}while(c<=number);
		System.out.println("The factorial of a number : "+ fact);
		
		
		//3
		System.out.println("Enter the number for multiplication : \n");
		Scanner sncm = new Scanner(System.in);
		int nums = sncm.nextInt();
		int mult=1;
		do {
			
			System.out.println(nums+"X"+mult+"="+(nums*mult));
			
		}while(mult<=10);
		
		sncm.close();
		
		
		//4.
		int num, rem=0, sum=0, temp;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        temp = num;
        sum=0;
		
       do
        {
            rem = num%10;
            sum = sum+rem;
            num = num /10;
            
        } while( num>0);
		
        System.out.print("Sum of Digits of " +temp+ " is " +sum); 
        scan.close();
        
		//5.
        int numbrev = 1234567, reversed = 0;

       do {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            numbrev /= 10;
        } while(numbrev != 0 );

        System.out.println("Reversed Number: " + reversed);
        
        
        
        //6.
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");
        int inm =1 ;
        do
        {
            System.out.print(num1+" ");

            
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            ++inm;
        }while (  inm <= count);
		
		
		
		
		
	}

}
