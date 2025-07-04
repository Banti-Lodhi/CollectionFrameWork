package com.SpringSystem.DesignPattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonDesign {
    public static SingletonDesign instance;
    public Properties configProperties;

    SingletonDesign() {
        //load configuration file/database
        configProperties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            configProperties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static synchronized SingletonDesign getInstance() {
        if (instance == null) {
            instance = new SingletonDesign();
        }
        return instance;
    }

    public String getProperty(String key) {
        return configProperties.getProperty(key);
    }
}
    //usage in company application
//   String dbUrl = SingletonDesign.getInstance().getProperty("database.url");
//String apiKEy = SingletonDesign.getInstance().getProperty("external.service.key");

