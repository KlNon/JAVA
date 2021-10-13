package CLASS_JAVA.Class_6.TCL;

import CLASS_JAVA.Class_6.TV;
import CLASS_JAVA.Class_6.airconditioner;
import CLASS_JAVA.Class_6.electricalAppliances;

public class TCL extends electricalAppliances {
    @Override
    public TV createTV() {
        return new tclTV();
    }

    @Override
    public airconditioner createAirconditioner() {
        return new tclAirconditioner();
    }
}
