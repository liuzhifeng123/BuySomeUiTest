package business;

import base.DriverBase;
import handle.AddBrandPageHandle;

/**
 * Created by zhifeng
 * 2020/4/10 15:31
 */
public class AddBrandPro {
    private DriverBase driver;
    private AddBrandPageHandle addBrandPageHandle;
    public AddBrandPro(DriverBase driver){
        this.driver = driver;
        this.addBrandPageHandle = new AddBrandPageHandle(driver);
    }
    public void clickAddButt(){
        addBrandPageHandle.clickAddButt();
    }
    //添加品牌
    public void addBrand(String branname,String introduce,String sort,String psth ){
        addBrandPageHandle.sendKeysBranName(branname);
        addBrandPageHandle.sendKeysIntroduce(introduce);
        addBrandPageHandle.sendKeysSort(sort);
        addBrandPageHandle.sendKeysBranImg(psth);
    }
    //提交添加品牌
    public void  submission(){
        addBrandPageHandle.clickSubmiButt();
    }
    public boolean assertBranNameIsnull(){
        return addBrandPageHandle.getBranNameTextErr();
    }
    public boolean assertIntroduceIsNull(){
        return addBrandPageHandle.getIntroduceTestErr();
    }
    public boolean assertSortIsNull() {
        return addBrandPageHandle.getSortTestErr();
    }
}
