package CLASS_JAVA.src.factory;

public class AddFactory extends OperatorFactory{
    @Override
    public Operator createOperator() {
        return new Add();
    }
}
