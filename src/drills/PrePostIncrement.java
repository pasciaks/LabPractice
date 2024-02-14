package drills;

public class PrePostIncrement {

	public static void main(String[] args) {

		// NOTE ZERO is missing! from the output

		int count = 0;

		while ((count = count + 1) < 10) {
			System.out.println(count);
		}

		count = 0;
		while ((count += 1) < 10) {
			System.out.println(count);
		}

		count = 0;
		while (count++ < 10) {
			System.out.println(count);
		}

		System.out.println("count is " + count);

		int age = 54;
		String adultStatus = age >= 18 ? "adult" : "child";
		System.out.println(adultStatus);

	}

}
