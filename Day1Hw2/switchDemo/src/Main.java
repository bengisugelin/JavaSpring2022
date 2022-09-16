
public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':

			System.out.println("Sen bir harikasin dostum! Gectin :)");
			break;
		case 'B':
		case 'C':
			System.out.println("Iyi! Gectiniz :)");
			break;

		case 'D':
			System.out.println("gectiniz..buna gecmek denirse..-_-");
			break;

		case 'F':
			System.out.println("Hay aksi! Kaldiniz.. Seneye gorusuruz, dimi? :(");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");

		}

	}

}
