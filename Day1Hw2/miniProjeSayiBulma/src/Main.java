
public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 3;
		boolean isMatch = false;
		
		for (int sayi:sayilar) {
			if(sayi == aranacak)
			{
				isMatch = true;
				break;
			}
		}
			
		if (isMatch) {
			System.out.println("aranan sayi mevcut");
		}else {
			System.out.println("aranan sayi mevcut degil");
		}
		
		

	}

}
