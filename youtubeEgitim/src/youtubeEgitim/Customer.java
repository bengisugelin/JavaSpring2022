package youtubeEgitim;

public class Customer {
	private int id; // properties
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer() {
		System.out.println("Musteri nesnesi baslatildi");
	}

	/*
	 * public void Save() { System.out.println("Musteri kaydedildi."); } //SOLID
	 * prensiplerine gore bu method n=burada yazilmamali cunku bir class sadece bir
	 * is yapmali. //Suan bu class musterinin ozelliklerini tutuyor. Buna bir de
	 * ayrica baska bir operasyon eklemis oluyoruz. Bunu burada degil, //ayri bir
	 * class olusturarak yapmaliyiz. (customerManager)
	 */

}
