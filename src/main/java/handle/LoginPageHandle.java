package handle;

import base.DriverBase;
import page.LoginPage;

/**
 * Created by zhifeng
 * 2020/4/9 22:16
 */
public class LoginPageHandle {
    private DriverBase driver;
    private LoginPage loginPage;
    public LoginPageHandle(DriverBase driver){
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }
    //输入账号
    public void senKeysUserName(String username){
        loginPage.getUserNmae().clear();
        loginPage.getUserNmae().sendKeys(username);
    }
    //输入密码
    public void senKeysPassword(String passwword){
        loginPage.getUserNmae().clear();
        loginPage.getPassword().sendKeys(passwword);
    }
    //点击登录
    public void clickButLogin(){
        loginPage.getButLogin().click();
    }
    //获取登录成功后首页文字
    public String getTextLogin(){
       return loginPage.getLogin().getText();
    }
}
