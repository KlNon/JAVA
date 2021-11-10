package CLASS_JAVA.Step2.Class_4.encrypt;

public class encrypt {
    public String encryptFile(String plainText)
    {
        System.out.println("数据加密,将明文转换为密文");
        String es="";
        for(int i=0;i<plainText.length();i++){
            String c =String.valueOf(plainText.charAt(i)%7);
            es +=c;
        }
        System.out.println(es);
        return es;
    }
}
