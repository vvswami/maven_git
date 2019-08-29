package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("pass");

	}

}
