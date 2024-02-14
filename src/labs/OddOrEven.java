package labs;

public class OddOrEven {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		/*
		 * Write a program that reads an int number from the user. Use an expression to
		 * determine if the number is even (use the modulus operator, %.) Store the
		 * result of the expression in a boolean variable. Write an if statement that
		 * uses the variable to determine whether to print Odd. or Even..
		 * 
		 * 
		 */

		int number = 0;

		boolean isEven = false;

		System.out.print("Enter a whole number: ");

		number = input.nextInt();

		isEven = number % 2 == 0;

		if (isEven) {
			System.out.println("Even.");
		} else {
			System.out.println("Odd.");
		}

		input.close();

	}

}
