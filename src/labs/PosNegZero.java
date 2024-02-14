package labs;

public class PosNegZero {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a number from the user and prints out whether the
		 * number is positive, negative, or zero. Use no if statements.
		 * 
		 * (Solution: solutions/PosNegZero.java)
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");

		int number = input.nextInt();

		String result = number == 0 ? "zero" : number > 0 ? "positive" : "negative";

		System.out.println(result);

		input.close();

	}

}
