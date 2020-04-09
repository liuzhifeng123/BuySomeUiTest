package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by zhifeng
 * 2020/4/9 21:02
 */
public class SelectDriver {
    public WebDriver driverName(String browser){
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
            return new ChromeDriver();
        }else {
            System.setProperty("webdriver.firefox.driver", "");
            return new FirefoxDriver();
        }
    }

}
