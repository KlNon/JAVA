package CLASS_JAVA.Step2.Class_4.encrypt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class getSource {
    public String read(String file){
        System.out.println("读取文件,获取明文");
        StringBuffer sb=new StringBuffer();
        try {
            FileInputStream FIS=new FileInputStream(file);
            int data;
            while ((data=FIS.read())!=-1)
            {
                sb=sb.append((char) data);
            }
            FIS.close();
            System.out.println(sb.toString());
        }catch (FileNotFoundException e){
            System.out.println("文件未找到!");
        }
        catch (Exception e){
            System.out.println("其他错误.");
        }
        return sb.toString();
    }
}
