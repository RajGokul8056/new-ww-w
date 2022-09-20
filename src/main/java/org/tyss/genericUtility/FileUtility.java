package org.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * this class contains reusable methods for csv file and property file 
	 * @author rajgokul.r
	 *
	 */
	
		private Properties p;
		/**
		 * This method is used for initiallize the proprtyfile 
		 * @param filepath
		 * @throws  
		 */
		public void intiallizePropertyFile(String filepath) {
			FileInputStream fis=null;
		
				try {
					fis = new FileInputStream(filepath);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 p= new Properties();
				try {
					p.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
				
			}
		
	/**
	 * this method is  used to fetch the data from propertyfile 
	 * @param key
	 * @return
	 */
	public String getDataFromProperty(String key) {
		return p.getProperty(key);
	}

}
