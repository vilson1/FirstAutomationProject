package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();

    static {
        FileInputStream file=null;
        try {
            file=new FileInputStream("src/test/java/configurations.properties");
            properties.load(file);
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
