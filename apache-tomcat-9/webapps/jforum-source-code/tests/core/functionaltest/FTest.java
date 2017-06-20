package functionaltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTest {

	private WebDriver driver;
	private String site = "http://143.106.73.20:8080/bodgeit/";
	
	public void setUp() throws Exception {
		String target = System.getProperty("zap.targetApp");
		if (target != null && target.length() > 0) {
			// Theres an override
			site = target;
		}
		System.setProperty("webdriver.chrome.driver", "/home/cc2011/ra085893/testes/chromedriver/");
		this.setDriver(new ChromeDriver());
	}
	
	
}
