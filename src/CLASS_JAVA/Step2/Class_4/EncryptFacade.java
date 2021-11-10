package CLASS_JAVA.Step2.Class_4;

import CLASS_JAVA.Step2.Class_4.encrypt.*;

public class EncryptFacade {
    private getSource reader;
    private encrypt cipher;
    private save writer;

    public EncryptFacade(){
        reader = new getSource();
        cipher = new encrypt();
        writer = new save();
    }

    //调用子系统对象的业务方法
    public void fileEncrypt(String fileSrc,String fileDes){
        String plainStr = reader.read(fileSrc);
        String encryptStr= cipher.encryptFile(plainStr);
        writer.write(encryptStr,fileDes);
    }
}
