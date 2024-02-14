package labs;

public class Multiply {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		/*
		 * Write a program that prompts the user five times to enter an integer number.
		 * The first time, store the number in an int variable, and print it out. The
		 * remaining four times, use *= to multiply the variable by the user's input and
		 * print it again.
		 * 
		 * (Solution: solutions/Multiply.java)
		 * 
		 */

		int number = 0;
		int stored = 0;

		int iteration = 1;

		while (iteration <= 5) {
			System.out.print("Enter a whole number: " + iteration + " of 5: ");
			number = input.nextInt();
			if (iteration == 1) {
				stored = number;
				System.out.println(stored);
			} else {
				stored *= number;
				System.out.println(stored);
			}
			iteration++;
		}

		input.close();

	}

}
