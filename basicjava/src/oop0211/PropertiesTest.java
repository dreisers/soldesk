package oop0211;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//Properties 클래스
		try {
			String fileName= "D:/java1113/workspace/basicjava/src/oop0211/command.properties";
			FileInputStream fis = new FileInputStream(fileName);
			Properties pr = new Properties();
			pr.load(fis);
			Iterator iter = pr.keySet().iterator();
			
			while(iter.hasNext()) {
				String key = (String)iter.next();
				String value = pr.getProperty(key);
				System.out.println(key);
				System.out.println(value);
			}//while end
		}catch (Exception e) {
			System.out.println("실패 : " + e);
		}//try end

	}//main end
}//class end
