package CLASS_JAVA.Step1.Class_3.factory;

import CLASS_JAVA.Step1.Class_3.Calculation;
import CLASS_JAVA.Step1.Class_3.Factory;
import CLASS_JAVA.Step1.Class_3.cal.Div;

public class divFactory extends Factory {
    @Override
    public Calculation CreateCalculation(String cal){
        return new Div();
    }
}
