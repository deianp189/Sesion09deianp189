// Generated by Selenium IDE
package org.ual.hmis.equipo18;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class EliminartareafalloTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// Browser selector
		int browser = 0; // 0: firefox, 1: chrome,...
		Boolean headless = true; //Este parametro se pone en false si quieres que abra la ventana del navegador, si no pues false.

		switch (browser) {
		case 0: // firefox
			// Firefox
			// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
			// Descomprimir el archivo geckodriver.exe en la carpeta drivers

			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (headless)
				firefoxOptions.setHeadless(headless);
			driver = new FirefoxDriver(firefoxOptions);

			break;
		case 1: // chrome
			// Chrome
			// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
			// Descomprimir el archivo chromedriver.exe en la carpeta drivers

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (headless)
				chromeOptions.setHeadless(headless);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);

			break;

		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void eliminartareafallo() {
		// Test name: eliminar-tarea-fallo
		// Step # | name | target | value
		// 1 | open | / |
		driver.get("http://msdocs-node-mongo-2023-deianp189.azurewebsites.net/");
		// 2 | setWindowSize | 665x674 |
		driver.manage().window().setSize(new Dimension(665, 674));
		// 3 | click | name=taskName |
		driver.findElement(By.name("taskName")).click();
		// 4 | click | css=.btn-success |
		driver.findElement(By.cssSelector(".btn-success")).click();
	}
}
