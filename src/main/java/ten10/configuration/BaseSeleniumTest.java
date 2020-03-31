package ten10.configuration;

import com.frameworkium.core.ui.tests.BaseUITest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSeleniumTest extends BaseUITest {

    public BaseSeleniumTest() {
        String browser = System.getProperty("browser");
        if (browser != null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    break;
                case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                    break;
                case "edge":
                   WebDriverManager.edgedriver().setup();
            }
        } else {
            WebDriverManager.firefoxdriver().setup();
        }
    }


}