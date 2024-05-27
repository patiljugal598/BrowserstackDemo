package browserstack.crossbrowserTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void titleCheck() throws MalformedURLException, URISyntaxException {
		
		MutableCapabilities cap = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URI("https://hub.browserstack.com/wd/hub").toURL(), cap);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}
