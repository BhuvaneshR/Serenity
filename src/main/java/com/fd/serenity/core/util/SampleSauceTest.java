package com.fd.serenity.core.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleSauceTest {

	public static WebDriver driver = null;
	public static final String USERNAME = "Rajkumar1994";//System.getenv("SAUCE_USERNAME");
	public static final String ACCESS_KEY = "55b81d68-415a-4488-94c2-da9c2d6b3447";
	//System.getenv("SAUCE_ACCESS_KEY");
	public static final String URL = "http://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	private static ThreadLocal<WebDriver> webDriverSauce = new ThreadLocal<WebDriver>();
	private static ThreadLocal<String> sessionId = new ThreadLocal<String>();

	public static WebDriver SauceTest() throws MalformedURLException {
		// TODO Auto-generated method stub
		// driver = createdriver("chrome", "41", "Windows 7", "Testcase");
		// driver.get("https://uat1.merchantportal.firstdata.eu/MerchantAdminWeb/login");
		System.out.println("title of page is: " + driver.getTitle());
		// driver.quit();
		return driver;

	}

	public static WebDriver createdrivermobile(String appiumVersion, String deviceName, String deviceOrientation,
			String platformVersion, String platformName, String browserName, String methodName)
			throws MalformedURLException {
		if (platformName.equalsIgnoreCase("iOS")) {
			DesiredCapabilities capabilities = DesiredCapabilities.iphone();
			capabilities.setCapability("appiumVersion", appiumVersion);
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("deviceOrientation", deviceOrientation);
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability("platformName", platformName);
			capabilities.setCapability("browserName", browserName);

			String jobName = methodName + '_' + deviceName + "_" + browserName + '_' + platformName + '_' + '_'
					+ System.currentTimeMillis();
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));
			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		} else if (platformName.equalsIgnoreCase("Android")) {
			DesiredCapabilities capabilities = DesiredCapabilities.android();
			capabilities.setCapability("appiumVersion", appiumVersion);
			capabilities.setCapability("deviceName", deviceName);
			capabilities.setCapability("deviceOrientation", deviceOrientation);
			capabilities.setCapability("platformVersion", platformVersion);
			capabilities.setCapability("platformName", platformName);
			capabilities.setCapability("browserName", browserName);

			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String date = sdf.format(d);
			String jobName = methodName + '_' + deviceName + "_" + browserName + '_' + platformName + '_' + '_' + date;
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));
			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		}
		return webDriverSauce.get();
	}

	public static WebDriver createdriver(String browser, String version, String os, String methodName)
			throws MalformedURLException {
		if (browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 7");
			caps.setCapability("version", "73.0");

			/*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			if (version != null) {
				capabilities.setCapability(CapabilityType.VERSION, version);
			}
			capabilities.setCapability(CapabilityType.PLATFORM, os);

			String jobName = methodName + '_' + os + '_' + browser + '_' + version + '_' + System.currentTimeMillis();
			capabilities.setCapability("name", jobName);*/
			System.out.println(URL);
			webDriverSauce.set(new RemoteWebDriver(new URL(URL), caps));

			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			/*String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);*/
		} else if (browser.equalsIgnoreCase("IE")) {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			if (version != null) {
				capabilities.setCapability(CapabilityType.VERSION, version);
			}
			capabilities.setCapability(CapabilityType.PLATFORM, os);

			String jobName = methodName + '_' + os + '_' + browser + '_' + version + '_' + System.currentTimeMillis();
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));

			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		} else if (browser.equalsIgnoreCase("MS Edge")) {
			DesiredCapabilities capabilities = DesiredCapabilities.edge();
			if (version != null) {
				capabilities.setCapability(CapabilityType.VERSION, version);
			}
			capabilities.setCapability(CapabilityType.PLATFORM, os);

			String jobName = methodName + '_' + os + '_' + browser + '_' + version + '_' + System.currentTimeMillis();
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));

			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			if (version != null) {
				capabilities.setCapability(CapabilityType.VERSION, version);
			}
			capabilities.setCapability(CapabilityType.PLATFORM, os);

			String jobName = methodName + '_' + os + '_' + browser + '_' + version + '_' + System.currentTimeMillis();
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));

			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		}

		else if (browser.equalsIgnoreCase("Safari")) {
			DesiredCapabilities capabilities = DesiredCapabilities.safari();
			if (version != null) {
				capabilities.setCapability(CapabilityType.VERSION, version);
			}
			capabilities.setCapability(CapabilityType.PLATFORM, os);

			String jobName = methodName + '_' + os + '_' + browser + '_' + version + '_' + System.currentTimeMillis();
			capabilities.setCapability("name", jobName);

			webDriverSauce.set(new RemoteWebDriver(new URL(URL), capabilities));

			String id = ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
			sessionId.set(id);

			String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", id, jobName);
			System.out.println(message);
		}

		return webDriverSauce.get();

	}

	public static WebDriver getWebDriver() {
		System.out.println("WebDriver" + webDriverSauce.get());
		return webDriverSauce.get();
	}

	public String getSessionId() {
		return sessionId.get();
	}

}
