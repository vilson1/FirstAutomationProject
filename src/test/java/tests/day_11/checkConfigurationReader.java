package tests.day_11;

import utilities.ConfigurationReader;

public class checkConfigurationReader {
    public static void main(String[] args) {
        System.out.println(ConfigurationReader.getProperty("browser"));
    }
}
