package nopComm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NOPCommLogin2 {

	// pre-condition ------- before
	// testcase ----- Test
	// post-condition ----After

	
	@After
	public void closeApp() {

		System.out.println("========closeApp============");

	}

	@Test
	public void verifyAppTitle() {

		System.out.println("verifyAppTitle test case");

	}
	
	
	

	@Before
	public void launchApp() {

		System.out.println("============launch an applicaiton on chrome browser============");

	}


}
