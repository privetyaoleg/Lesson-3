import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of your array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(array));
		double max = (double)(findMaxValue(array));
		System.out.println("MAX = " + max);
		
		double[] doubleArray = new double[size];
		for (int i=0;i<array.length;i++) {
			
			doubleArray[i] =  Math.rint(1000.0*(array[i]/max))/1000;
		}
		System.out.println(Arrays.toString(doubleArray));
		

	}
	
	static public int findMaxValue(int[] array){
		int max = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
			
		return max;
	}

}
