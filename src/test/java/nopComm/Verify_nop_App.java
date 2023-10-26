package nopComm;

import org.testng.annotations.Test;

import utiltity.ReadConfigFile;
import utiltity.ReadConfigFile_Static;

public class Verify_nop_App {
	
	
	@Test
	public void launchapp() throws Exception {
		
		
		//create an object
		ReadConfigFile conf = new ReadConfigFile();
		
		System.out.println("==========non static ==================");
		System.out.println("applicaition URL: " + conf.get_appURL());
		System.out.println("applicaition user: " + conf.get_username());
		System.out.println("applicaition pass: " + conf.get_password());
		
		
	}
	
	
	
	@Test
	public void launchapp_static() throws Exception {
		
		
		//create an object
		//ReadConfigFile conf = new ReadConfigFile();
		System.out.println("==========non static ==================");
		System.out.println("applicaition URL: " + ReadConfigFile_Static.get_appURL());
		System.out.println("applicaition user: " + ReadConfigFile_Static.get_username());
		System.out.println("applicaition pass: " + ReadConfigFile_Static.get_password());
		
		
	}

}
