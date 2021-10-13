package CLASS_JAVA.src.factory;

import java.util.Scanner;

public class Div implements Operator {
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue/rvalue;
    }
}
