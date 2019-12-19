package com.fd.dp.steplib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Props{
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		Properties props=new Properties();
		props.setProperty("Name_1", "Bhuvi");
		props.setProperty("Name", "Ammu");
		File file = new File("config.properties");
		FileWriter fileOut = new FileWriter(file);
		props.store(fileOut, null);
		fileOut.close();
	}
}