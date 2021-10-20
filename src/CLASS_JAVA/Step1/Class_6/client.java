package CLASS_JAVA.Step1.Class_6;

import CLASS_JAVA.Step1.Class_6.Hair.Hair;
import CLASS_JAVA.Step1.Class_6.TCL.TCL;

public class client {
    public static void main(String[] args) {
        TCL tcl= new TCL();
        Hair hair=new Hair();
        TV tv=tcl.createTV();
        airconditioner air=tcl.createAirconditioner();
        tv.playing();
        air.cold();
        air.hot();
        tv= hair.createTV();
        air= hair.createAirconditioner();
        tv.playing();
        air.cold();
        air.hot();
    }
}
