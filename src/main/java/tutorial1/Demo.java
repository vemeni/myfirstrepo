package tutorial1;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println();
		System.out.println("This program is running version " + Demo.class.getPackage().getImplementationVersion());
	}
}
