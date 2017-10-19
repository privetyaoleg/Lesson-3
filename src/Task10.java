import java.util.Arrays;
import java.util.Scanner;


public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
	
			do {
			System.out.print("Enter the size of your array = ");
			size = sc.nextInt();
			}
			while (size <= 0);
	
			int[] array = new int[size];
	
			for (int i = 0; i<array.length; i++) {
				System.out.print("Enter " + (i+1) + " element = ");
				array[i] = sc.nextInt();
			}
			System.out.println("Your array: " + Arrays.toString(array));
			
			
			boolean positive = false;
			for (int i = 0; i<array.length; i++) {
				
				if (array[i]>0){
					System.out.println("First positive element: " + array[i]);
					positive = true;
					break;
				}
				
			}
				if (positive == false)
					System.out.println("There isn't a positive element!");
				
				
				
			}
	
	}