package CLASS_JAVA.Class_3;

import CLASS_JAVA.Class_3.cal.Add;
import CLASS_JAVA.Class_3.cal.Div;
import CLASS_JAVA.Class_3.cal.Mul;
import CLASS_JAVA.Class_3.cal.Sub;

import java.util.Scanner;

abstract public class Factory {
    abstract public Calculation CreateCalculation(String cal);
}
