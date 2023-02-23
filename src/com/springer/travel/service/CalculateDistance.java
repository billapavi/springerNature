package com.springer.travel.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.springer.travel.Cities;
import com.springer.travel.GenericRoute;

public class CalculateDistance {
	
	public static int calculate(Cities source, Cities destination) {
		
		try (InputStream input = new FileInputStream("path/to/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty(source+"_"+destination));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return 0;
	}

}
