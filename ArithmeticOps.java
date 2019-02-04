//Write program to perform all the arithmetic operations given in the table
import java.util.*;
public class ArithmeticOps {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Hello Welcome to the Arithmetic Operators \n ");
		System.out.println("Enter the Integers ");
		Scanner scn = new Scanner(System.in);
		a= scn.nextInt();
		b=scn.nextInt();
		
		System.out.println("The Addition is "+(a+b));
		System.out.println("The Subtraction is "+(a-b));
		System.out.println("The Mutltiplication  is "+(a*b));
		System.out.println("The Division is "+(a/b));
		int incs = ++a;
		int decs = --b; 
		System.out.println("The increment on first number  is "+incs);
		System.out.println("The decrement on second  is "+decs);
		
		scn.close();
		
		
	}

}
