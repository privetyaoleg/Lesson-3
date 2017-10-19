import java.util.Scanner;


public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		System.out.print("Enter figure: ");
		int figure = sc.nextInt();
		
		
		int lastFigure = 0;
		int result = 0;
		
		while (number > 0) {
				
				lastFigure = number%10;
				number = number/10;
				
				if (lastFigure == figure) {
					continue;
				}
				
				
				result = result * 10 + lastFigure%10;
			
				
			}
		System.out.println(result);
				
		}
		
	

}