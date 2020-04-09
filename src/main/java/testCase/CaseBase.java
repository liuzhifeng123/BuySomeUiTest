package testCase;

import base.DriverBase;

/**
 * Created by zhifeng
 * 2020/4/9 21:34
 */
public class CaseBase {
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
