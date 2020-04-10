package util;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

/**
 * Created by zhifeng
 * 2020/4/9 21:36
 */
public class ProUtil {
    private Properties prop;
    private String filePath;

    public ProUtil(String filePath) {
        this.filePath = filePath;
        this.prop = readProperties();
    }

    /**
     * 读取配置文件
     */
    public Properties readProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\" + filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getPro(String key) throws RuntimeException {
        if (prop.containsKey(key)) {
            String username = prop.getProperty(key);
            return username;
        } else {
            System.out.println("你获取的Key有误！");
            return "";
        }
    }

    public void writePro(String naem , String value){
        Properties propertie = new Properties();
        propertie.setProperty(naem,value);
        try {
            FileOutputStream outputFile = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\token.properties");
            propertie.store(outputFile,"File was saved!");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
