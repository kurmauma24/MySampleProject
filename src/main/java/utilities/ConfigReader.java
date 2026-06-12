package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop; // This object stores all data from config.properties.

	public ConfigReader() throws Exception {

		prop = new Properties();

FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");

		prop.load(fis);
	}

	public String getProperty(String key) {

		return prop.getProperty(key);
	}
}

