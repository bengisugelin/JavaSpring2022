package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("yapici blok calisti");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
	public Product() {};

	// attribute | field
	String name;
	String description;
	Double price;
	int stockAmount;
	String renk;
	String kod;

	// getter
	// public int getId() { // id yi okuyabilir demek
	// return _id;
	// }
	// setter
	// public void setId( int id) {
	// _id = id; // this, benim icersinde bulundugum class demek. (this.id)
	// }

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}
