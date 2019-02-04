// All the if programs in one 
import java.util.*;
public class AllTheIfs {

	public static void main(String[] args) {
		
		//1 to check the voter age
		
		System.out.println("Enter the age of the voter : \n");
		int age ;
		Scanner scn = new Scanner(System.in);
		age = scn.nextInt();
		scn.close();
		if(age<18) {
			System.out.println("Not Elgible to vote");
		}
		else {
			System.out.println("You are eligble to vote");
			
		}
		
		
		
		//2.Write a program to check if the  number is positive or negative.
		
		int number;
        
        System.out.print("Enter the number you want to check:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        
        
        //3. Write a program to find largest of two numbers.
        
        System.out.println("Enter two numbers : \n");
        Scanner sccn = new Scanner(System.in);
        int a = sccn.nextInt();
        int b = sccn.nextInt();
        
        if(a>b) {
        	System.out.println("first number is bigger than second");
        	
        }
        else {
        	
        	System.out.println("Second number is bigger than first");
        }
        sccn.close();
        
        //4.  Write a program to check given number is even or odd. (Hint: use % operator)
        System.out.println("Enter the number to be checked for odd even : \n");
        Scanner scccn = new Scanner(System.in);
        int oddeve = scccn.nextInt();
        if(oddeve%2==0) {
        	
        	System.out.println("The number is even");
        }
        else {
        	
        	System.out.println("The number is odd");
        	
        }
        scccn.close();
		
	}
	
	

}
