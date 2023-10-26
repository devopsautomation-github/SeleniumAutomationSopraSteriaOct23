package utiltity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile_Static {

	public static Properties prop;

	public ReadConfigFile_Static() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public static String get_appURL() {

		String url = prop.getProperty("appURL_QA");
		return url;
	}

	public static String get_username() {

		return prop.getProperty("username");
	}

	public static  String get_password() {

		return prop.getProperty("password");
	}

}
