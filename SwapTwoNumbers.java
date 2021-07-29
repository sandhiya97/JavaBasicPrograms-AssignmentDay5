import java.util.*;
import java.util.Scanner;
public class SwapTwoNumbers {
	 public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);  
		  System.out.print("Enter the first number: ");  
		  float first = sc.nextFloat();
		  Scanner sc1 = new Scanner(System.in);  
		  System.out.print("Enter the second number: ");  
		  float second = sc.nextFloat();

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        // Value of first is assigned to temporary
	        float temporary = first;

	        // Value of second is assigned to first
	        first = second;

	        // Value of temporary (which contains the initial value of first) is assigned to second
	        second = temporary;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	    }
}
