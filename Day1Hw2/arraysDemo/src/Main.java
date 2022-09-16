import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Sauron";
		String ogrenci2 = "Gollum";
		String ogrenci3 = "Gandalf";
		
		System.out.println(ogrenci1);
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Sauron";
		ogrenciler[1] = "Gollum";
		ogrenciler[2] = "Gandalf";
		ogrenciler[3] = "Frodo";
		
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
	
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
