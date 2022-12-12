package oopsConcepts;

import org.junit.Test;

public class AmazonTest {
	@Test
	public void test() {
		String actual = "Iphone";
		String Expected = "Iphone 13";
		String ErrorMessage = "Validation failed";

		// Assert as= new Assert();
		Assert.assertEqual(actual, Expected, ErrorMessage); // when the methods are static no need to create object to
															// class

	}

}
