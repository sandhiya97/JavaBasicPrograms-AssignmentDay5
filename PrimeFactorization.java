package PrimeFactorization;
import java.util.Scanner;
public class PrimeFactorization {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		System.out.println("Prime Factors are : " );

		for (int i = 2; i < num; i++) 
		{
			while (num % i == 0)
			{
				System.out.println(i + " ");
				num = num / i;  
			}
		}
		if (num > 2) {
			System.out.println(num);
		}

	}
}
