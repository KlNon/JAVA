package CLASS_JAVA.Class_3.factory;

import CLASS_JAVA.Class_3.Calculation;
import CLASS_JAVA.Class_3.Factory;
import CLASS_JAVA.Class_3.cal.Sub;

public class subFactory extends Factory {
    @Override
    public Calculation CreateCalculation(String cal){
        return new Sub();
    }
}
