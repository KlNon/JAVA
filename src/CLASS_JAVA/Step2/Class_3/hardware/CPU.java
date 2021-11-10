package CLASS_JAVA.Step2.Class_3.hardware;

public class CPU extends Hardware{
    private static CPU cpu=new CPU();
    private CPU(){}
    public static CPU getCpu()
    {
        return cpu;
    }
    public void run(){
        System.out.println("CPU启动...");
    }
}
