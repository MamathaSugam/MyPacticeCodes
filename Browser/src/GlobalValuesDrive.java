import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("E:\\SeleniumProjects\\Selenium2020-Workspace\\Browser\\TestData.properties");
		prop.load(fis);
		prop.getProperty("ID");
		prop.getProperty("Password");
	System.out.println(prop.getProperty("ID"));
	System.out.println(prop.getProperty("Password"));
	
	prop.setProperty("ID", "PAVAN");
	FileOutputStream fos= new FileOutputStream("E:\\SeleniumProjects\\Selenium2020-Workspace\\Browser\\TestData.properties");
	prop.store(fos, null);
	System.out.println(prop.getProperty("ID"));
	}
	
	

}
