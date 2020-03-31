package ten10.configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static final Properties properties;
    private static final String environmentPrefix;
    private static PropertiesConfiguration config;

    /* initialise data, the key defaults to this when none is specified at command line */
    static {
        properties = new Properties();
        try {
            initPropertiesFromFile();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        environmentPrefix = System.getProperty("env", "test") + ".";
    }

    private static void initPropertiesFromFile() throws ConfigurationException{
        InputStream stream = Config.class.getResourceAsStream("/config.properties");
        config = new PropertiesConfiguration("src/test/resources/config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setProperty(String key, String value)  {
        config.setProperty(environmentPrefix+key, value);
        try {
            config.save();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String s) {
        return properties.getProperty(environmentPrefix + s);
    }
}