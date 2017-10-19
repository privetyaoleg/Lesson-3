import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = sc.nextInt();
		System.out.print("Enter second number: ");
		int second = sc.nextInt();
		
		if (first%2 == 0)
			System.out.println("The first number is EVEN!");
		else 
			System.out.println("The second number is EVEN!");
	}

}