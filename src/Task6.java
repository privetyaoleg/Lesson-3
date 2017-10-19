import java.util.Scanner;


public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		if (number == 0){
			System.out.println("Your number is 0." );
		}
		if (number > 0){
			System.out.println("Your number > 0.");	
		}
		if (number < 0) {
			System.out.println("Your number < 0.");
		}
		num(number);
		
	}
	
	static public void num(int fig) {
		int figure = Math.abs(fig);
		if (figure < 10) {
			System.out.println("It has 1 figure");
		}
		else if(figure > 10 && figure < 100){
			System.out.println("It has 2 figures");
		}
		else if (figure > 100 && figure < 1000){
			System.out.println("It has 3 figures");
		} else {
			System.out.println("It has > 3 figures");
		}
	}

}
