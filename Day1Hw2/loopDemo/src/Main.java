import java.util.Iterator;

public class Main {
	
	

	public static void main(String[] args) {
		//FOR DONGUSU
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("For Dongusu bitti");
		
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("For Dongusu bitti");
		
		
		//WHILE DONGUSU
		
		int i = 2;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Dongusu bitti.");
		
		//Do-While
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do-While Dongusu bitti.");
	

	}

}
