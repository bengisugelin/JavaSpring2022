package polymorphismDemo;

public class DatabseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to Database: " + message);
	}

}
