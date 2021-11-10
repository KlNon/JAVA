package CLASS_JAVA.Step2.Class_3.hardware;

public class OS extends Hardware{
    private static OS os=new OS();
    private OS(){}
    public static OS getOs()
    {
        return os;
    }
    public void load(){
        System.out.println("操作系统载入...");
    }
}