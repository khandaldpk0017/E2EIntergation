package com.web.automation.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static String applicationConfigReader(String key) throws IOException
	{
		File f= new File("./ConfigFiles/ProjectConfiguration.properties");
		FileReader fr = new FileReader(f);
		Properties prop= new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String elementLocatorReader(String key) throws IOException
	{
		File f= new File("./ConfigFiles/ElementLocators.properties");
		FileReader fr = new FileReader(f);
		Properties prop= new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
}
