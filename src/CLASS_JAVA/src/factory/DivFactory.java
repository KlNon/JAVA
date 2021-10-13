package CLASS_JAVA.src.factory;

public class DivFactory extends OperatorFactory{
    @Override
    public Operator createOperator() {
        return new Div();
    }
}
