import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter diameter = ");
		double diameter = sc.nextDouble();
		System.out.print("Please, enter heigth = ");
		double heigth = sc.nextDouble();
		System.out.print("Consumption of paint = ");
		double paint = sc.nextDouble();
		
		
		double squareOfCircle = (Math.PI*(diameter*diameter))/4;
		double squareOfRectangle = Math.PI*diameter*heigth;
		double generalSquare = squareOfCircle + squareOfRectangle;
		double needPaint = generalSquare / paint;
		System.out.println(needPaint);
		int num = (int) Math.ceil(needPaint);
		System.out.println("You need " + num + " tins of paint!");

	}


}

