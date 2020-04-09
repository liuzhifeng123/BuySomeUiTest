package page;

import base.DriverBase;
import org.openqa.selenium.WebElement;
import util.getBy;

/**
 * Created by zhifeng
 * 2020/4/9 22:05
 */
public class LoginPage extends BasePage {

    public LoginPage(DriverBase driver) {
        super(driver);
    }
    //获取账号输入框
    public WebElement getUserNmae(){
        return element(getBy.getByLocator("username"));
    }

    //获取密码输入框
    public WebElement getPassword(){
        return element(getBy.getByLocator("password"));
    }
    //获取登录按钮

    public WebElement getButLogin(){
        return element(getBy.getByLocator("butlogin"));
    }

    public WebElement getLogin(){
        return element(getBy.getByLocator("login"));
    }
}
