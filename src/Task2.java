import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int first = sc.nextInt();
		System.out.print("Enter your second number: ");
		int second = sc.nextInt();
		int temp = 0;
		temp = first;
		first = second;
		second = temp;
		System.out.println("Exchanging... First = " + first + ", second = " + second);

	}

}
