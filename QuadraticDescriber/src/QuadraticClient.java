import java.util.Scanner;
//Daniel Zheng
//10/6/17
public class QuadraticClient {
		public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Welcome to Quadratic Describer!");
			System.out.println("Please input your 3 coefficients:");
		boolean done = false;
		do {
			System.out.print("a: ");
		double a = userInput.nextDouble();
			System.out.print("b: ");
		double b = userInput.nextDouble();
			System.out.print("c: ");
		double c = userInput.nextDouble();
			System.out.println();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		String finished = userInput.next();
		char answer = finished.charAt(0);
		if (answer == 'q') {
			done = true;
		}
		System.out.println();
		} while (done == false);
	}
}
