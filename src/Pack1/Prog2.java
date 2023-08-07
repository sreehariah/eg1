package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sreehari A H\\Desktop\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https:\\www.google.com");
	}

}
