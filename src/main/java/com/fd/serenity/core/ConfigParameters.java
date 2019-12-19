package com.fd.serenity.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigParameters {
	
	public static String REGISTER_PSWD=null;
	public static String HOME=null;
	public static String FORGOT_PSWD=null;
	public static String LOGIN_PSWD=null;
	public static String browser;
	public static int explicit_wait;
	public static int implicit_wait;
	public static String URL_Final = "", UserName = "", Password = "";
	public static String ChromeDrive_Loc ="", GeckoDriver_Loc="",IEDriver_Loc="";
	//public static String env="stg";
	
	private static ConfigParameters config;
	private Properties props;
	public static ConfigParameters getInstance() {
		if(config==null) {
			config = new ConfigParameters();
			config.init();
		}
		return config;
	}
	
	private ConfigParameters () {}
	
	public void init() {
		props = new Properties();
		try {
			InputStream configFile_Input = new FileInputStream(new File(".").getCanonicalPath() + "/config.properties");
			props.load(configFile_Input);
		   // env = System.getProperty("env");
		      
//			/* login */
//			URL_Final = "URL_" + env.toUpperCase();
//			URL_Final = props.getProperty(URL_Final);
//			UserName = props.getProperty("UserName");
//			Password = props.getProperty("Password");			
//			/* URLs List from config file */
//			String register_pswd = env.toUpperCase() +"_REGISTER_PSWD" ;
//			REGISTER_PSWD = URL_Final + props.getProperty(register_pswd.toString());				
//			String home = props.getProperty("Environment").toUpperCase() +"_HOME" ;
//			HOME = props.getProperty(home.toString());			
//			String forgor_pswd = env.toUpperCase() +"_FORGOT_PSWD" ;
//			FORGOT_PSWD= URL_Final +props.getProperty(forgor_pswd.toString());		
//			String login_pswd = env.toUpperCase()+"_LOGIN_PSWD" ;
//			LOGIN_PSWD =URL_Final + props.getProperty(login_pswd.toString());		
//			/* wait time */

			  browser = props.getProperty("Browser");
			  explicit_wait = Integer.parseInt(props.getProperty("EXPLICIT_WAIT")); // explicit_wait =
			//  explicit_wait = Integer.parseInt(explicit_wait);
			 //			/* Driver Location */
			ChromeDrive_Loc=props.getProperty("ChromeDriver");
//			GeckoDriver_Loc=props.getProperty("GeckoDriver");
			IEDriver_Loc=props.getProperty("IEDriver");
//			
//			configFile_Input = null;
//			props = null;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String propName) {
		return this.props.getProperty(propName);
	}
	
	public String getEnv() {
		if(System.getProperty("Environment") != null) {
			return System.getProperty("Environment").toUpperCase(); 
		} else {
			return this.props.getProperty("Environment").toUpperCase();
		}
	}

	public String getURL() {
		return getProperty("URL_" + getEnv());
	}
	public String getPassword() {
		return getProperty("Password");
	}
	public String getUserName() {
		return getProperty("UserName");
	}
}
