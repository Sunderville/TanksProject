package com.sunderville.tanks.config;

import java.io.InputStream;
import java.util.Properties;


public class Config {

    public static String getProp(String propValue) {
        Properties properties = new Properties();

        try (InputStream is = Config.class.getClassLoader()
                    .getResourceAsStream("Technical_data.properties")) {

                properties.load(is);

            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }

        return properties.getProperty(propValue);
    }






//    Вариант из StudentProject

//    private static Properties properties = new Properties();
//
//    public synchronized static String getProperty(String number) {
//        if (properties.isEmpty()) {
//            try (InputStream is = Config.class.getClassLoader()
//                    .getResourceAsStream("Technical_data.properties")) {
//
//                properties.load(is);
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                throw new RuntimeException(ex);
//            }
//        }
//        return properties.getProperty(number);
//    }

}
