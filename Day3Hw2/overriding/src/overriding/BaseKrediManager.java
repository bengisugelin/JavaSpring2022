package overriding;

public class BaseKrediManager {
	public double Hesapla(double tutar) { //eger final keyword u kullanilirsa bu method override edilemez.
		return tutar * 1.18;
	}

}
