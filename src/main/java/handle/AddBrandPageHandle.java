package handle;


import base.DriverBase;
import net.sf.cglib.asm.$AnnotationVisitor;
import page.AddBrandPage;

/**
 * Created by zhifeng
 * 2020/4/10 15:10
 */
public class AddBrandPageHandle {
    private DriverBase driver;
    private AddBrandPage addBrandPage;
    public AddBrandPageHandle(DriverBase driver){
        this.driver =  driver;
        this.addBrandPage =  new AddBrandPage(driver);
    }
    //点击添加按钮
    public void clickAddButt(){
        addBrandPage.getAddButt().click();
    }
    //输入品牌名
    public void sendKeysBranName(String branname){
        addBrandPage.getBranName().clear();
        addBrandPage.getBranName().sendKeys(branname);
    }
    //输入品牌介绍
    public void sendKeysIntroduce(String introduce){
        addBrandPage.getIntroduce().clear();
        addBrandPage.getIntroduce().sendKeys(introduce);
    }
    //输入品牌排序序号
    public void  sendKeysSort(String sort ){
        addBrandPage.getSort().clear();
        addBrandPage.getSort().sendKeys(sort);
    }
    //上传图片
    public void sendKeysBranImg(String path){
        addBrandPage.getBranImg().sendKeys(path);
    }
    //获取错误文本信息
    public boolean getBranNameTextErr(){
          String branName =  addBrandPage.getBranNameIsNullText().getText();
          if(branName == null){
              return false;
          }else {
              return true;
          }
    }
    public boolean getIntroduceTestErr(){
        String introduce = addBrandPage.getIntroduceIsNullText().getText();
        if (introduce == null){
            return false;
        }else {
            return true;
        }
    }
    public boolean getSortTestErr(){
        String sort = addBrandPage.getSortIsNullText().getText();
        if (sort == null){
            return false;
        }else {
            return true;
        }
    }

    public void clickSubmiButt(){
         addBrandPage.getSubmiButt().click();
    }
}
