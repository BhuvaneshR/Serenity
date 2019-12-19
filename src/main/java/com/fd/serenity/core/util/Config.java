package com.fd.serenity.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class Config {
	static Ini configINI = null;
//	*//**
//	* <b>Description</b> Loads Config .ini file and returns static ini. 
//	 * @throws FileNotFoundException 
//	*//*
	private static Ini loadinifile() throws FileNotFoundException {
	configINI = new Ini();
	   //FileOutputStream fos = new FileOutputStream("Config.ini"); 
	   
	try {
		File temp = new File(System.getProperty("user.dir") + "\\" + "config.ini");
	InputStream file = Config.class.getClassLoader().getResourceAsStream("/config");
	if(file==null) file= Config.class.getResourceAsStream("/config");
	configINI.load(temp);
	//configINI.load(file);
	} catch (InvalidFileFormatException e) {
	e.printStackTrace();
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	 
	return configINI;
	}

	public static synchronized String get(String sectionName, String keyName) throws FileNotFoundException{
	if(configINI == null){
	configINI = loadinifile();
	}
	String keyValue = configINI.get(sectionName, keyName);
	return (keyValue==null)
	? "" : keyValue;
	}
	public static synchronized String get(String sectionName, String keyName, String defaultValue) throws FileNotFoundException{
	if(configINI == null){
	configINI = loadinifile();
	}
	String keyValue = configINI.get(sectionName, keyName);
	return (keyValue==null || keyValue=="")
	? defaultValue : keyValue;
	}
}
