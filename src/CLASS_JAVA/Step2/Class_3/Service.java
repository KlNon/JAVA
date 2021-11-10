package CLASS_JAVA.Step2.Class_3;

import CLASS_JAVA.Step2.Class_3.hardware.*;

public class Service {
    private static Memory memory=Memory.getMemory();
    private static CPU cpu=CPU.getCpu();
    private static HardDisk hardDisk=HardDisk.getHardDisk();
    private static OS os =OS.getOs();
    public void check(){
        memory.check();
    }
    public void run(){
        cpu.run();
    }
    public void read(){
        hardDisk.read();
    }
    public void load(){
        os.load();
    }
}
