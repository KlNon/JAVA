package CLASS_JAVA.Step1.Class_6.TCL;

import CLASS_JAVA.Step1.Class_6.airconditioner;

public class tclAirconditioner extends airconditioner {
    @Override
    public void cold() {
        System.out.println("TCL空调制冷中");
    }

    @Override
    public void hot() {
        System.out.println("TCL空调制热中");
    }
}
