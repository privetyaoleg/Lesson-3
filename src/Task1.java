

public class Task1 {

	public static void main(String[] args) {
		
		
		int random = (int)( Math.random()*900);
		System.out.println(random);
		
		int first = 0;
		int second = 0;
		int third = 0;
		
		if (random >= 100 ) {
			first = random/100;
			second = (random/10)%10;
			third = random%10;
			System.out.println(first + " " + second + " " +third);
			System.out.println("addition of figures: " + (first+second+third));
			System.out.println("multiply of figures: " + (first*second*third));
		}
		if (random < 100 && random >= 10){
			first = random/10;
			second = random%10;
			System.out.println(first + " " + second);
			System.out.println("addition of figures: " + (first+second));
			System.out.println("multiply of figures: " + (first*second));
		}
		
		if (random < 10 ) {
			first = random;
			System.out.println(random);
			System.out.println("addition of figures: " + first);
			System.out.println("multiply of figures: " + first);
		}
		

	}

}