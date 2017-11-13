import java.util.Scanner;

public class HelloWorld {

	private static Scanner inputName;

	public static void main(String[] args) {
		String name = " ";
		
		inputName = new Scanner(System.in);
		System.out.println("Hello World! What is your name?");
		
		name = inputName.nextLine();
		
		System.out.println("Hello " + name + " nice to meet you");
		
		System.out.println("\nLet's count from one to ten");
		
		for (int k = 0; k < 11; k++) {
			System.out.println("Counting: "+ k);
		}

	}

}
