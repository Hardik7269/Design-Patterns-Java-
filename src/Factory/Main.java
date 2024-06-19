package Factory;

public class Main {
	public static void main(String[] args) {
		MenuFactory factory = new MenuFactory();
		Menu item = factory.getItem("vadapav");
		item.prepare();
		Menu item2 = () -> System.out.println("preparing Samosa");
		item2.prepare();	
	}
}
