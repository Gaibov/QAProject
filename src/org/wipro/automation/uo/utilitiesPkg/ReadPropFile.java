package org.wipro.automation.uo.utilitiesPkg;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile
{

	public static String readconfigdata(String key) throws Exception
	{
		FileReader fr= new FileReader("./testdata/config.properties");
	
	Properties prop=new Properties();
	prop.load(fr);
	return prop.get(key).toString();
	}
	
	public static String readelementdata(String key) throws Exception
	{
		FileReader fr= new FileReader("./testdata/element.properties");
	
	Properties prop=new Properties();
	prop.load(fr);
	return prop.get(key).toString();
	}
}
