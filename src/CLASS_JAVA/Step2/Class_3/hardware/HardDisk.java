package CLASS_JAVA.Step2.Class_3.hardware;

public class HardDisk extends Hardware{
    private static HardDisk hardDisk=new HardDisk();
    private HardDisk(){}
    public static HardDisk getHardDisk()
    {
        return hardDisk;
    }
    public void read(){
        System.out.println("硬盘读取...");
    }
}
