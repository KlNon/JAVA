package CLASS_JAVA.src.simplefactory;

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

            System.out.println("运算结果为：");
            double result = OperatorFactory.getOperator(ope).calculate(lvalue, rvalue);
            if(Double.isInfinite(result)){
                System.out.println("对不起，被除数不能为0");
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
