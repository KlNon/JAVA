package CLASS_JAVA.Step2.Class_4.encrypt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class save {
    public void write(String encryptStr,String file){
        System.out.println("保存密文,写入文件.");
        try {
            FileOutputStream FOS=new FileOutputStream(file);
            FOS.write(encryptStr.getBytes(StandardCharsets.UTF_8));
            FOS.close();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在!");
        }
        catch (IOException e){
            System.out.println("文件操作错误");
        }
    }
}
