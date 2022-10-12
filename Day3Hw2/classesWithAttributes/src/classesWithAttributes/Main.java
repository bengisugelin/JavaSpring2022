package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000.0, 3, "siyah");
		
		/*	Product product = new Product();		
			product.setName("Laptop");
			product.setId(1);
			product.setDescription("Asus Laptop");
			product.setPrice(5000.0);
			product.setStockAmount(3);
		*/
			

			ProductManager productManager = new ProductManager();
			productManager.Add(product);
			
			System.out.println(product.getKod());

			//productManager.Add2(1, "", "", 2, 200); yanlis kullanim

	}

}
