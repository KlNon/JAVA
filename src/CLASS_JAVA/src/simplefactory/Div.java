package CLASS_JAVA.src.simplefactory;

import java.util.Scanner;

public class Div implements Operator{
    @Override
    public double calculate(double lvalue, double rvalue) {
        while(Double.isInfinite(lvalue/rvalue)){
            System.out.println("除数不能为0");
            rvalue = new Scanner(System.in).nextDouble();
        }
        return lvalue/rvalue;
    }
}
