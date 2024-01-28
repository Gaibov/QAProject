package testPkg;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	
	public static void readprop() throws Exception
	{
		
		FileReader fr=new FileReader("./MyFolder/file.properties");
		
		Properties prop=new Properties() ;
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
		
	}
	
	public static void writedata() throws Exception
	{
		
		
		 //File f= new File("C:\\Users\\Admin\\Desktop\\file1.txt");
		 
		 File f= new File("./MyFolder/file3.txt");
		 FileWriter fw=new FileWriter(f,true);
		 fw.write("\nThis is forth line");
		 fw.flush();   //save file
		 fw.close();
	}
	
	public static void readdata() throws Exception
	{
		
		
		 //File f= new File("C:\\Users\\Admin\\Desktop\\file1.txt");
		 
		 File f= new File("./MyFolder/file2.txt");
		 FileReader fr = new FileReader(f);
        
		 
		 
		 int r=fr.read();
		 
		 while(r!=-1)
		 {
			 System.out.print((char)r);
			 r=fr.read();
		 }
		 //r=fr.read();
		 //System.out.print((char)r);
		 //r=fr.read();
		 //System.out.print((char)r);
		 //r=fr.read();
		 //System.out.print((char)r);
		 //r=fr.read();
		 //System.out.print((char)r);
	}
	
	public static void main(String[] args) throws Exception
	{

		//FileHandling.writedata(); 
		FileHandling.readprop(); 
		
		}
}
