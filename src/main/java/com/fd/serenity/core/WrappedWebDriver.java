package com.fd.serenity.core;

import java.io.File;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.fd.serenity.core.ConfigParameters;
import com.fd.serenity.core.util.ExcelUtil_browserconfig;
import com.fd.serenity.core.util.SampleSauceTest;

import net.thucydides.core.webdriver.DriverSource;

public class WrappedWebDriver implements DriverSource {
	static String driverName = "";
	static String provider = "";
	static String browserCounter;
	SampleSauceTest sauceLabsTest = new SampleSauceTest();
	ExcelUtil_browserconfig excelUtil = new ExcelUtil_browserconfig();
	public static String[] testCase, browser;
	public static int browsercounter = 0, tccounter = 0;
	public static String currentTC;
	public ArrayList<String> deviceID = new ArrayList<String>();
	public int count = 0;

	@Override
	public WebDriver newDriver() {

		WebDriver driver = null;
		try {
			//System.setProperty("browserName", "LOCALHeadless");
		    System.setProperty("browserName", "LOCALChrome");
			String browserConfig = System.getProperty("browserName");

			System.out.println("The current working directory is:" + System.getProperty("user.dir"));
			String[] keys = { "TestConfigurationID", "ExecutionMode", "MobileToolName", "MobileExecutionPlatform",
					"MobileOSVersion", "DeviceName", "Browser", "BrowserVersion", "Platform", "AppiumVersion",
					"PlatformVersion", "Resolution", "deviceOrientation" };
			String[] testConfig = ExcelUtil_browserconfig.getTestConfig(keys, browserConfig);
			String iePageLoadTimeout = "100";
			if (testConfig[0].contains("LOCAL")) {
				if (testConfig[6].equalsIgnoreCase("IE")) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
					System.setProperty("webdriver.ie.driver",
							new File(".").getCanonicalPath() + ConfigParameters.IEDriver_Loc);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(iePageLoadTimeout), TimeUnit.SECONDS);
					System.out.println("IE DRIVER");
				} else if (testConfig[6].equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver",
							new File(".").getCanonicalPath() + ConfigParameters.ChromeDrive_Loc);
					ChromeOptions options = new ChromeOptions();
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("profile.default_content_setting_values.notifications", 0);
					prefs.put("download.default_directory", System.getProperty("user.dir") + "\\reports");
					prefs.put("safebrowsing.enabled", "true");
					options.setExperimentalOption("prefs", prefs);
					options.addArguments("disable-extensions");
					options.addArguments("--start-maximized");
					driver = new ChromeDriver(options);
					System.out.println("Chrome DRIVER");
					
				}else if (testConfig[6].equalsIgnoreCase("HEADLESS_CHROME")) {
					System.setProperty("webdriver.chrome.driver",
							new File(".").getCanonicalPath() + ConfigParameters.ChromeDrive_Loc);			
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless");
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("profile.default_content_setting_values.notifications", 0);
					prefs.put("download.default_directory", System.getProperty("user.dir") + "\\reports");
					prefs.put("safebrowsing.enabled", "true");
					options.setExperimentalOption("prefs", prefs);
					options.addArguments("disable-extensions");
					driver = new ChromeDriver(options);
					System.out.println("Chrome DRIVER -- headless");
				}else if (testConfig[6].equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.firefox.driver",
							new File(".").getCanonicalPath() + ConfigParameters.GeckoDriver_Loc);
					DesiredCapabilities dc = DesiredCapabilities.firefox();
					FirefoxProfile profile = new FirefoxProfile();
					profile.setPreference("browser.download.dir", System.getProperty("user.dir") + "\\reports");
					dc.setCapability(FirefoxDriver.PROFILE, profile);
					driver = new FirefoxDriver(dc);
				} else {
					driver = null;
				}
			} else if (testConfig[0].contains("SaucelabsWeb")) {
				DesiredCapabilities caps;
				if (testConfig[6].equalsIgnoreCase("FIREFOX")) {
					caps = DesiredCapabilities.firefox();
				} else if (testConfig[6].equalsIgnoreCase("INTERNET_EXPLORER")) {
					caps = DesiredCapabilities.internetExplorer();
				} else if (testConfig[6].equalsIgnoreCase("SAFARI")) {
					caps = DesiredCapabilities.safari();
				} else if (testConfig[6].equalsIgnoreCase("MS Edge")) {
					caps = DesiredCapabilities.edge();
				} else {
					caps = DesiredCapabilities.chrome();
				}
				if (!(testConfig[7].equals(null)) && !(testConfig[8].equals(null)) && !(testConfig[11].equals(null))) {
					caps.setCapability("version", testConfig[7]);
					caps.setCapability("platform", testConfig[8]);
					caps.setCapability("screenResolution", testConfig[11]);
				} else {
					throw new NullPointerException("Browser Version or Platform is null");
				}
				// driver = new RemoteWebDriver(new URL(URL),caps);//not getting
				// called.
				System.out.println(testConfig[6]+testConfig[7]+testConfig[8]);
				driver = sauceLabsTest.createdriver(testConfig[6], testConfig[7], testConfig[8], "MEPOE");
			} else if (testConfig[0].contains("SaucelabsMobile")) {
				DesiredCapabilities caps;
				if (testConfig[2].equalsIgnoreCase("WEB_ANDROID")) {
					caps = DesiredCapabilities.android();
				} else if (testConfig[2].equalsIgnoreCase("WEB_IOS")) {
					caps = DesiredCapabilities.iphone();
				} else {
					caps = DesiredCapabilities.iphone();    // Need to agree on the
															// Default Config or
															// restrict the
															// Dropdown in Run
															// Manager
				}
				System.out.println("appiumVersion" + testConfig[9] + "******" + "deviceName" + testConfig[5] + "******"
						+ "platformVersion" + testConfig[10] + "******" + "platformName" + testConfig[3] + "********"
						+ "browserName" + testConfig[6]);
				if (!(testConfig[5].equals(null)) && !(testConfig[9].equals(null))) {
					caps.setCapability("appiumVersion", testConfig[9]);
					caps.setCapability("deviceName", testConfig[5]);
					caps.setCapability("platformVersion", testConfig[10]);
					caps.setCapability("platformName", testConfig[3]);
					caps.setCapability("browserName", testConfig[6]);
					// caps.setCapability("platform", testConf[8]); Need to see
					// if the Platform is required in the Mobile Test
				} else {
					throw new NullPointerException("Browser Version or Platform is null");
				}
				driver = sauceLabsTest.createdrivermobile(testConfig[9], testConfig[5], testConfig[12], testConfig[10],
						testConfig[3], testConfig[6], "MEPOE");
				// driver = new RemoteWebDriver(new URL(URL),caps); //not
				// getting called.
			} else {
				driver = null;
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();

		}

		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}
