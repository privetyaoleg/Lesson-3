import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year = ");
		int year = sc.nextInt();
		
			if (year%4 != 0){
				System.out.println("Your year is NEVISIKOSNIY");
			}
			if (year%4 == 0 ) {
				if (year%100 != 0)
				System.out.println("Your year is VISOKOSNIY");
				if (year%100 == 0)
				System.out.println("Your year is NEVISOKOSNIY");	
			}
			
			if (year%100 == 0 && year%400 != 0) {
				System.out.println("Your year is NEVISIKOSNIY");
			}
			

	}

}