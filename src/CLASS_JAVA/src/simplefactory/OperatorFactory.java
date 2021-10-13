package CLASS_JAVA.src.simplefactory;

import java.util.Scanner;

public class OperatorFactory {
    public static Operator getOperator(String args){
        switch (args) {
            case "+":
                return new Add();
            case "-":
                return new Min();
            case "*":
                return new Mul();
            case "/":
                return new Div();
            default:
                System.out.println("必须是+-*/之一");
                System.out.println("请输入一个数");
                args = new Scanner(System.in).next();
                return getOperator(args);
        }
    }
}
