
public class Main {

	public static void main(String[] args) {
		int sayi - 12;
		//sayi = "Ankara" // Sayi integer bir ifade oldugu icin string bir degisken tanimlayamayiz
		
		// int - primitive type olarak tanimlanmaktadir. Bellekte 4 bytelik yer kaplar.
		// +-2  milyar arasini belleginde tutabilir.
		sayi = 11111111111; //-> 2 milyarin ustunde oldugu icin kizdi.
		
		byte sayi1 = 12; // byte en fazla 127 ye kadar kabul eder. -128 ile +127 arasini alir. bellekte 1 bytlik veri kaplar
		sayi1 = 128; //-> 127 den buyuk oldugu icin kizdi.
		
		//Eger daha buyuk bir veri tipi istiyorsak, long dan yararlaniyoruz.
		//long bellekte 8 bytelik yer kaplar. Int e gore iki kat daha fazla bellek tuketimi yapilir.
		
		double sayi2 = 12.5; 
		float sayi3 = 13.2;  //double ve float ondalikli sayi tutar
		
		char karakter = 'B';  // 2 byte lik yer kaplayan, tek karakter tutan bir veri tipidir.
		boolean dogruMu = true;   // true ya da false alabilen degiskendir. 1 byte lik yer kaplar
		
		

	}

}
