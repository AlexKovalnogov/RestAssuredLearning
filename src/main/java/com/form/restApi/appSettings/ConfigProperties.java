package com.form.restApi.appSettings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigProperties {

    public String readProperty(String propertyName) {
        FileInputStream ip;

        Properties properties = new Properties();
        {
            URL url = getClass().getClassLoader().getResource("config.properties");
            try {
                ip = new FileInputStream(url.getPath());
                properties.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(propertyName);
    }
}





