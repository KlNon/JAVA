package CLASS_JAVA.Step2.Class_3.hardware;

public class Memory extends Hardware{
    private static Memory memory=new Memory();
    private Memory(){}
    public static Memory getMemory()
    {
        return memory;
    }
    public void check(){
        System.out.println("内存自检...");
    }
}
