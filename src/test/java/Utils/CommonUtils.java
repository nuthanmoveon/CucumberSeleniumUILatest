package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

	public Properties getConfigProperties() {
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("src\\test\\resources\\Config\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

}
