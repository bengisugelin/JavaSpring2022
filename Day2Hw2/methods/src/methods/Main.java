package methods;

public class Main {

	public static void main(String[] args) {
		SayiBulmaca();

	}

	public static void SayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 3;
		boolean isMatch = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				isMatch = true;
				break;
			}
		}

		if (isMatch) {
			mesajVer("aranan sayi mevcuttur: " + aranacak);
		} else {
			mesajVer("aranan sayi mevcut degildir: " + aranacak);
			
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
