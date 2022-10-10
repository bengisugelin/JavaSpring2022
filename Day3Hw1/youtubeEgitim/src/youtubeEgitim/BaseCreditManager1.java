package youtubeEgitim;

public abstract class BaseCreditManager1 implements ICreditManager {

	@Override
	public abstract void Calculate();

	@Override
	public void Save() {
		System.out.println("Kaydedildi.");
		
	}


}
