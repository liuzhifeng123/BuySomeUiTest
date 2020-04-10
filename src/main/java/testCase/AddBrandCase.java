package testCase;

import base.DriverBase;
import business.AddBrandPro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.HandleCookie;
import util.ProUtil;

/**
 * Created by zhifeng
 * 2020/4/10 16:42
 */
public class AddBrandCase extends CaseBase {
    private DriverBase driver;
    private ProUtil proUtil;
    private AddBrandPro addBrandPro;
    private HandleCookie handleCookie;
    private static Logger logger = LoggerFactory.getLogger(AddBrandCase.class);
    @BeforeClass
    public void beforeClass() throws Exception {
        this.driver = InitDriver("chrome");
        this.proUtil = new ProUtil("login.properties");
        this.addBrandPro = new AddBrandPro(driver);
        driver.get(proUtil.getPro("brandurl"));
        this.handleCookie = new HandleCookie(driver);
        handleCookie.setCookie();
        driver.winMax();
        driver.waitFor();
        driver.refresh();

    }
    @Test
    public void testAddBtand(){
        driver.get(proUtil.getPro("brandurl"));
        addBrandPro.clickAddButt();
        addBrandPro.addBrand(proUtil.getPro("branname"),proUtil.getPro("introduce"),
                proUtil.getPro("sort"),proUtil.getPro("branimg"));
        addBrandPro.submission();
        if (addBrandPro.assertBranNameIsnull()){
            logger.info("==============品牌商名称不能为空=============");
        }else if (addBrandPro.assertIntroduceIsNull()){
            logger.info("==============介绍不能为空=============");
        }else if (addBrandPro.assertSortIsNull()){
            logger.info("==============排序不能为空=============");
        }else {
            logger.info("==============品牌添加成功=============");
        }
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
