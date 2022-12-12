package utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Properties;



public class ReadConfig {



    Properties prop;



    public ReadConfig() throws Exception {



        FileInputStream fis = new FileInputStream("./testData/config.properties");



        prop = new Properties();



        prop.load(fis);



    }



    public String appURL() {



        return prop.getProperty("app_url_QA");



    }



    public String getEmail() {



        return prop.getProperty("adminUserName");



    }



    public String getPass() {



        return prop.getProperty("adminPassword");



    }



}