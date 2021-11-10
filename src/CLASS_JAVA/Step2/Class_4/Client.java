package CLASS_JAVA.Step2.Class_4;

public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("D:\\a.txt","D:\\b.txt");
    }
}
