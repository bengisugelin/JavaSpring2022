package polymorphismDemo;

import java.sql.DatabaseMetaData;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	
	public void add() {
		System.out.println("Musteri eklendi");
		//DatabseLogger logger = new DatabseLogger();  bu bagimli bir sistem ornegi
		//logger.Log("Log mesaji");
		this.logger.log("log mesaji");
	}

}
