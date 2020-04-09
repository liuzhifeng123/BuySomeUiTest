package page;

import base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhifeng
 * 2020/4/9 21:14
 */
public class BasePage {
    private DriverBase driver;
    private static Logger logger = LoggerFactory.getLogger(BasePage.class);
    public BasePage(DriverBase driver){
        this.driver = driver;
    }
    /**
     *定位Element
     */
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /**
     * 子父节点定位Element
     */
    public WebElement nodeElement(By by,By nodeby){
        WebElement el = this.element(by);
        return el.findElement(nodeby);
    }
    /**
     * 封装点击
     */
    public void click(WebElement element){
        if (element != null){
            element.click();
        }else {
            logger.error("==========未定位到元素，点击失败！==========");
        }
    }
    /**
     * 封装输入
     */
    public void sendKeys(WebElement element,String value){
        if (element != null){
            element.sendKeys();
        }else {
            logger.error("==========未定位到元素，无法输入值！==========");
        }
    }
    /**
     * 判断元素是否展示
     */
    public boolean assertElmentIs(WebElement element){
        return element.isDisplayed();
    }
    /**
     * 获取文本信息
     */
    public String getText(WebElement element){
        return element.getText();
    }

}
