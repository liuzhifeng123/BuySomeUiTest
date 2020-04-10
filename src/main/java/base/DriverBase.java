package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhifeng
 * 2020/4/9 20:59
 */
public class DriverBase {
    private WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }
    /**
     * 封装Elemen方法
     */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return  element;
    }
    /**
     * 封装方get法
     */
    public void get(String url){
        driver.get(url);
    }
    /**
     * 获取cookcie
     */
    public Set<Cookie> getCookie(){
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies;
    }

    /**
     * 设置cookie
     * @param cookie
     */
    public void setCookie(Cookie cookie) {
        driver.manage().addCookie(cookie);
    }
    /**
     * 删除cookie
     */
    public void deleterCookie(){
        driver.manage().deleteAllCookies();
    }

    public void winMax() {
        driver.manage().window().maximize();
    }

    /**
     * 隐式等待
     */
    public void waitFor(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * 关闭页面
     */
    public void close() {
        driver.close();
    }

    /**
     * 获取当前页面URL
     */
    public void getCurrentUrl() {
        driver.getCurrentUrl();
    }

    /**
     *刷新页面
     */
    public void refresh() {
        driver.navigate().refresh();
    }
}
