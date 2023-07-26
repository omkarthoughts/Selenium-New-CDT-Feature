package CromeDevTools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class MobileEmlatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdiver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		//send command to CDP methods -> CDP Methods will invoke and get access to chrome devTools
		
		 devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		 driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		 driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Library")).click();
	}

}
