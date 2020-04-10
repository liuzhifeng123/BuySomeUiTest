package util;

import base.DriverBase;
import org.openqa.selenium.Cookie;

import java.io.IOException;
import java.util.Set;

/**
 * Created by zhifeng
 * 2020/4/6 16:25
 */
public class HandleCookie {
    private DriverBase driver;
    private ProUtil proUtil;
    public HandleCookie(DriverBase driver){
        this.driver = driver;
        this.proUtil = new ProUtil("token.properties");
    }
    public void setCookie() throws Exception {
        String value = proUtil.getPro("X-Litemall-Admin-Token");
        Cookie cookie = new Cookie("X-Litemall-Admin-Token",value,"testmall.supert.vip","/",null);
        driver.setCookie(cookie);
    }
    //获取cookie
    public void writeCookie() throws IOException {
        Set<Cookie> cookies = driver.getCookie();
        for (Cookie cookie :cookies){
            if (cookie.getName().equals("X-Litemall-Admin-Token")){
                proUtil.writePro(cookie.getName(),cookie.getValue());
            }
        }
    }
}
