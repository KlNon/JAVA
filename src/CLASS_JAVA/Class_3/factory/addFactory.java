package CLASS_JAVA.Class_3.factory;

import CLASS_JAVA.Class_3.Calculation;
import CLASS_JAVA.Class_3.Factory;
import CLASS_JAVA.Class_3.cal.Add;

public class addFactory extends Factory {

    @Override
    public Calculation CreateCalculation(String cal){
        return new Add();
    }
}
