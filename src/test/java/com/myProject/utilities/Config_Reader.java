package com.myProject.utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
    private static Properties properties =  new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        }catch (Exception e){
            System.out.println("Something wrong in config.reader!!!");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
