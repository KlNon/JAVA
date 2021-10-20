package CLASS_JAVA.Step1.Class_3.cal;

import CLASS_JAVA.Step1.Class_3.Calculation;

public class Add extends Calculation {

    @Override
    public Double calculate() {
        return getArg1()+getArg2();
    }
}