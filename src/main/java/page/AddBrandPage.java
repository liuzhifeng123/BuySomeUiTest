package page;

import base.DriverBase;
import org.openqa.selenium.WebElement;
import util.getBy;

/**
 * Created by zhifeng
 * 2020/4/10 14:48
 */
public class AddBrandPage extends BasePage {
    public AddBrandPage(DriverBase driver) {
        super(driver);
    }
    //获取添加按钮
    public WebElement  getAddButt(){
        return  element(getBy.getByLocator("addbutt"));
    }
    //获取品牌商名字输入框
    public WebElement getBranName(){
        return  element(getBy.getByLocator("branname"));
    }
    //获取介绍输入框
    public WebElement getIntroduce(){
        return element(getBy.getByLocator("introduce"));
    }
    //获取排序输入框
    public WebElement getSort(){
        return  element(getBy.getByLocator("sort"));
    }
    //获取上传图片输入框
    public  WebElement getBranImg(){
        return element(getBy.getByLocator("branimg"));
    }
    //获取商品名字为空文字说明
    public WebElement getBranNameIsNullText(){
        return element(getBy.getByLocator("branname_isnull"));
    }
    //获取介绍名字为空文字说明
    public WebElement getIntroduceIsNullText(){
        return element(getBy.getByLocator("introduce_isnull"));

    }
    //获取排序名字为空文字说明
    public WebElement getSortIsNullText(){
        return element(getBy.getByLocator("sort_isnull"));
    }
    //获取提交按钮
    public WebElement getSubmiButt(){
        return element(getBy.getByLocator("submibutt"));
    }
}
