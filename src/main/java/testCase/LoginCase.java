package testCase;

import base.DriverBase;
import business.LoginPro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.HandleCookie;
import util.ProUtil;

import java.io.IOException;

/**
 * Created by zhifeng
 * 2020/4/9 22:30
 */
public class LoginCase extends CaseBase {
    private DriverBase driver;
    private LoginPro loginPro;
    private ProUtil proUtil;
    private HandleCookie handleCookie;
    private static Logger logger = LoggerFactory.getLogger(LoginCase.class);
    @BeforeClass
    public void beforeClass(){
        this.driver = InitDriver("chrome");
        this.proUtil = new ProUtil("login.properties");
        this.loginPro = new LoginPro(driver);
        this.handleCookie = new HandleCookie(driver);
        driver.get(proUtil.getPro("url"));
        driver.winMax();
        driver.waitFor();
    }
    @Test
    public void testLogin() {
        loginPro.login(proUtil.getPro("username"),proUtil.getPro("password"));
        if (loginPro.AssertIndex()){
            try {
                handleCookie.writeCookie();
            }catch (IOException e){
                e.printStackTrace();
            }

            logger.info("==================登录成功！===============");
        }else {
            logger.info("==================登录失败！===============");
        }
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
