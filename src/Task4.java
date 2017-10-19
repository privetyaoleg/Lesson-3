import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		do {
		System.out.println("Please enter number with 4 figures: ");
		number = sc.nextInt();
		}
		while (number < 1000 || number > 10000);
			
		
		int first = number/1000;
		int second = (number/100)%10;
		int third = (number/10)%10;
		int fourth = number%10;
		int result = (first*second)+(third*fourth);
		System.out.println("Result = " +result);

	}

}