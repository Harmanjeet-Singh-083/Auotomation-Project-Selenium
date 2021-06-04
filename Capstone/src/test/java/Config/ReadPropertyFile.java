


package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

	static Properties properties;
	
	public static void loadData() throws Exception
	{
		properties = new Properties();
		File f= new File("G:\\Capstone Repository\\Capstone\\src\\test\\java\\config.properties");
			FileReader obj = new FileReader(f);
		properties.load(obj);
	}
	
	public static String getObject(String Data) throws Exception
	{
		loadData();
		String data = properties.getProperty(Data);
		return data;
	}

}