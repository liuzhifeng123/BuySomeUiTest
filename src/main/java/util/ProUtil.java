package util;

import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

    public void writePro(String setName, String setValue) {
        prop.setProperty(setName, setValue);
    }
}
