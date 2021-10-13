package CLASS_JAVA.Class_3.cal;

import CLASS_JAVA.Class_3.Calculation;

public class Sub extends Calculation {

    @Override
    public Double calculate() {
        return getArg1()-getArg2();
    }
}
