package polymorphismDemo;

public class Method {

	public static void main(String[] args) {
		// cokbicimlilik demektir
		//referans tiplerinin, aralarinda bir inheritance varsa, birbirlerinin referanslarini tutma durumudur.
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabseLogger(), new ConsoleLogger()};
//		
//		for(BaseLogger logger:loggers) {
//		logger.Log("Log mesaji");
//	}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

}
}
