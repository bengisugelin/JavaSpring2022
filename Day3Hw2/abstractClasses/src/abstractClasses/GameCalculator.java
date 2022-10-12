package abstractClasses;

public abstract class GameCalculator {  //benim bir sinifin var ama ben icerisindeki  methodlari belirlemek istemiyorum
	//ama bu sinifi inherit eden tum diger siniflarin bu methodu kullanmasinin zorunlu olmasini istiyorum.
	//bir abstract sinifta illa abstract method olmak zorunda degil.
	//ABSTRACT SINIFLAR NEWLENEMEZ!!!!!!!!
	public abstract void hesapla(); //bu sinifi kim kullaniyorsa, hesapla methodunu override etmek zorunda. 
	public final void gameOver() { // gameCalculator i kim kullaniyorsa, gameOveri bu sekilde kullanmak zorunda
		System.out.println("Oyun bitti!");
	}
}
