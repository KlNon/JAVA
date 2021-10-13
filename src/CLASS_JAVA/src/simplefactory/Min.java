package CLASS_JAVA.src.simplefactory;

public class Min implements Operator{
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue-rvalue;
    }
}
