package UtilityPackage;
import java.util.*;
import java.io.*;
public class PropertiesUtility {
		
	public static String readDataFromPropertyFile(String path,String key) {
			//need property file
			// what property (key)
			
		File file = new File(path);
		FileInputStream fis=null;
		Properties pro=new Properties();
		String data=null;
		try {
			fis=new FileInputStream(file);
			pro.load(fis);
			data=pro.getProperty(key);
			fis.close();
				
		} catch (FileNotFoundException e) {
			System.out.println("Error in the file path, please try again");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error in loading the file in properties object.");
			e.printStackTrace();
		}
			
			return data;
		}
	public static void writeDataToPropertyFile(String path, String key) {
		Scanner scan = new Scanner(System.in);
		File file = new File(path);
		FileInputStream fw = null;
		Properties p = new Properties();
		String data = null;
		try {
			fw = new FileInputStream(file);
			p.load(fw);
			System.out.println("Enter a number value: ");
			data = scan.nextLine();
			p.setProperty(key, data);
		}catch(FileNotFoundException e) {
			System.out.println("Error in the file path, please try again.");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Error in loading the file in properties object");
			e.printStackTrace();
		}
	}
	public static void deleteFromPropertyFile(String path, String key) {
		File file = new File(path);
		Properties p = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			p.load(fis);
			p.remove(key);
		}catch(FileNotFoundException e) {
			System.out.println("Error in the file path, please try again.");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Error in loading the file, please try again.");
		}
	}
}
