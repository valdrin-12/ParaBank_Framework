package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    private Driver(){}
    private static WebDriver driver;
    public static WebDriver getDriver(){//patjeter duhet ta perdorim getdriver metoden

        if(driver==null){

            String browserType =ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

                case "firefox" :WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                case "edge":WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;

                default:
                    throw new RuntimeException("Browser type is wrong");//nese shkrujm diqka qe nuk ka kuptim asjhdgasdgasj
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){

        if(driver!=null){//nese kemi driver te qelt atehere mbylle dhe jepi vlere null

            driver.quit();
            driver=null;
        }
    }
}
