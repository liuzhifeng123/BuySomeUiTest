package util;

import org.openqa.selenium.By;


/**
 * Created by zhifeng
 * 2020/4/9 21:45
 */
public class getBy {
    public static By getByLocator(String key){
        ProUtil proUtil = new ProUtil("element.properties");
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }
    }
}
