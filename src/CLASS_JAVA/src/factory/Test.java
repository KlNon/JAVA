package CLASS_JAVA.src.factory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            double lvalue, rvalue;
            Scanner scanner;
            String ope;
            while (true) {
                scanner = new Scanner(System.in);
                System.out.println("请输入一个数");
                try {
                    lvalue = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("必须为数字");
                    continue;
                }
                break;
            }

            System.out.println("请输入+-*/任意一个字符");
            ope = scanner.next();

            while (true) {
                scanner = new Scanner(System.in);
                System.out.println("请输入一个数");
                try {
                    rvalue = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("必须为数字");
                    continue;
                }
                break;
            }

            OperatorFactory factory = null;

            System.out.println("运算结果为：");

            while (factory == null) {
                switch (ope) {
                    case "+":
                        factory = new AddFactory();
                        break;
                    case "-":
                        factory = new MinFactory();
                        break;
                    case "*":
                        factory = new MulFactory();
                        break;
                    case "/":
                        factory = new DivFactory();
                        break;
                    default:
                        System.out.println();
                        System.out.println("必须是+-*/四种字符，请重新输入");
                        System.out.println("请输入一个数");
                        ope = new Scanner(System.in).next();
                        break;
                }
            }

            double result = factory.createOperator().calculate(lvalue, rvalue);

            if (Double.isInfinite(result)) {
                System.out.println("对不起，除数不能为0，请重新输入");
                rvalue = new Scanner(System.in).nextDouble();
            }else {
                System.out.println(result);
            }

            System.out.print("Exit?(y/n)");
            if(new Scanner(System.in).next().equals("y")){
                break;
            }
        }
    }
}
