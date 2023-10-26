package utiltity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		
		Properties prop = new Properties();
		
		
		prop.load(fis);
		
		
		
		String url = prop.getProperty("appURL_QA");
		
		System.out.println("application url: " + url);
		System.out.println("application username: " + prop.getProperty("username"));
		System.out.println("application password: " + prop.getProperty("password"));

	}

}
