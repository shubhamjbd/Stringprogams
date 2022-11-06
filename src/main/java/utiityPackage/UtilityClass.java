package utiityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilityClass {

	//pending with ReadingPropFileFromUtilitypackag
	public static InputStream propdata() throws IOException
	{
		  String projectpath=System.getProperty("user.dir");
	      System.out.println("print"+projectpath );
	      
			Properties prop=new Properties();
			InputStream input=new FileInputStream(projectpath+"\\config.properties");
			prop.load(input);
			return input;
			//prop.getProperty("URL");
			  
	}
}
