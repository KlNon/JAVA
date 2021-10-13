package CLASS_JAVA.src.factory;

public class Mul implements Operator {
    @Override
    public double calculate(double lvalue, double rvalue) {
        return lvalue*rvalue;
    }
}
