package Singelton;

public class OneInstanceOnly {
	public static OneInstanceOnly instance;
	private OneInstanceOnly() {
		System.err.println("Instance is created");
	}
	
	public static OneInstanceOnly getInstance() {
		if(instance == null) {
			instance = new OneInstanceOnly();
		}
		return instance;
	}
	public void start() {
		System.out.println("Working" + instance.toString());
	}
}
