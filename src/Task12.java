import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Task12 {

	public static void main(String[] args) {
		// Получить среднее арифметическое всех чётных элементов массива, стоящих на нечётных местах.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of your array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(array));
		
		int count = 0;
		int summ = 0;
		for (int i = 0; i<array.length;i++) {
			if (i%2 != 0 && array[i]%2 == 0) {
				count++;
				summ+=array[i];
			}
		}
		double average = summ/((double)count);
		System.out.println("Average = " + average);
		
		
		
	}
}
