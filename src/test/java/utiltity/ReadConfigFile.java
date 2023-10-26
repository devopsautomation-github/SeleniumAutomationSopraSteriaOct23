package utiltity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile {

	Properties prop;

	public ReadConfigFile() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String get_appURL() {

		String url = prop.getProperty("appURL_QA");
		return url;
	}

	public String get_username() {

		return prop.getProperty("username");
	}

	public String get_password() {

		return prop.getProperty("password");
	}

}
