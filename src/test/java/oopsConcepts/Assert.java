package oopsConcepts;

public class Assert {

	public static void assertEqual(String actual, String Expected) {
		if (actual.equalsIgnoreCase(Expected)) {

			System.out.println("Validation pass");

		}

		else {
			System.out.println("Validation fail");
		}
	}

	public static void assertEqual(String actual, String Expected, String ErrorMessage) {
		if (actual.equalsIgnoreCase(Expected)) {

			System.out.println("Validation pass");

		}

		else {

			System.out.println("Validation fail" + actual + "Error message is" + ErrorMessage);
		}
	}

}
