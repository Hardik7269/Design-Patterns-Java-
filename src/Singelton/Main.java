package Singelton;

public class Main {
	public static void main(String[] args) {
		OneInstanceOnly obj1 = OneInstanceOnly.getInstance();
		OneInstanceOnly obj2 = OneInstanceOnly.getInstance();
		
		obj1.start();
		obj2.start();
	}
}
