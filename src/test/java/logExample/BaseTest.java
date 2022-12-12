package logExample;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

	Logger log;

	@Before
	public void launchApp() {

		log = Logger.getLogger("Amazon App Module");
		PropertyConfigurator.configure("./testData/log4j.properties");
		log.info("Launching the app");

	}

	@After
	public void closeApp()

	{
		log.info("closing the app");
	}
}
