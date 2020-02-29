package technoCredits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static WebDriver getWebDriverForWindows(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver getWebDriverForMac(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_mac64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
