package business;

import base.DriverBase;
import handle.LoginPageHandle;

/**
 * Created by zhifeng
 * 2020/4/9 22:24
 */
public class LoginPro {
    private DriverBase driver;
    private LoginPageHandle loginPageHandle;
    public LoginPro(DriverBase driver){
        this.driver = driver;
        this.loginPageHandle = new LoginPageHandle(driver);
    }
    public void login(String username,String passwword){
        loginPageHandle.senKeysUserName(username);
        loginPageHandle.senKeysPassword(passwword);
        loginPageHandle.clickButLogin();
    }
    public Boolean AssertIndex(){
        if(loginPageHandle.getTextLogin().equals("首页")){
            return true;
        }else{
            return false;
        }
    }

}
