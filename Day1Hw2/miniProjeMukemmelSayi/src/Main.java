
public class Main {

	public static void main(String[] args) {
		// Mukemmel sayi: kendinden baska tum pozitif tam bolenlerinin sayisi kendine esit olan sayiya denir.
		//6 --> 1,2,3 
		//28 --> 1,2,4,7,14
		
		int number = 28;
		int total = 0;

		
		for (int i = 1; i < number; i++) {
			if(number%i == 0)
			{
				total += i;
			}
		}
		if (total == number)
		{
			System.out.println(number + " bir mukemmel sayidir");
		}
		else {
			System.out.println(number + " bir mukemmel sayi degildir");
		}
		

	}

}
