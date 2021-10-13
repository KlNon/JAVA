package CLASS_JAVA.src.simplefactory;

public class Mul implements Operator{
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue*rvalue;
    }
}
