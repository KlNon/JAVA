package CLASS_JAVA.Class_6.Hair;

import CLASS_JAVA.Class_6.TV;
import CLASS_JAVA.Class_6.airconditioner;
import CLASS_JAVA.Class_6.electricalAppliances;

public class Hair extends electricalAppliances {
    @Override
    public TV createTV() {
        return new hairTV();
    }

    @Override
    public airconditioner createAirconditioner() {
        return new hairAirconditioner();
    }
}
