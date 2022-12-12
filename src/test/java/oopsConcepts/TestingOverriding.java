package oopsConcepts;

import org.junit.Test;

public class TestingOverriding {

	@Test
	public void test()

	{
		CarOverriding car = new CarOverriding();
		car.brake();

		System.out.println("------------------");

		TataCarOverriding tata = new TataCarOverriding();
		tata.automaticFeature();
		tata.brake();
	}

}
