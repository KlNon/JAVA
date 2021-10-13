package CLASS_JAVA.Class_3;

import CLASS_JAVA.Class_3.factory.addFactory;
import CLASS_JAVA.Class_3.factory.divFactory;
import CLASS_JAVA.Class_3.factory.mulFactory;
import CLASS_JAVA.Class_3.factory.subFactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws MyException{
        Factory factory;
        Scanner scanner= new Scanner(System.in);


        try {
            double tempArg;
            double tempArg2;
            String cal;

            System.out.println("请输入一个数");
                try {
                    tempArg=scanner.nextDouble();
                }catch(Exception e){
                    throw new MyException("不为数字");
                }

            System.out.println("请输入+-*/任意一个字符");
                cal=scanner.next();
                switch (cal) {
                    case "+" -> factory=new addFactory();
                    case "-" -> factory=new subFactory();
                    case "*" -> factory=new mulFactory();
                    case "/" -> factory=new divFactory();
                    default ->
                        throw new MyException("未知符号,目前仅支持加减乘除(+,-,*,/)");
                }

            System.out.println("请输入一个数");
                try {
                    tempArg2=scanner.nextDouble();
                }catch (Exception e){
                    throw new MyException("不为数字");
                }
                try {
                    if(tempArg2==0&&cal.equals("/"))
                        throw new MyException();
                }catch(Exception e){
                    throw new MyException("被除数不能为0");
                }


            Calculation calculation=factory.CreateCalculation(cal);
            calculation.setArg1(tempArg);
            calculation.setArg2(tempArg2);
            calculation.setResult(calculation.calculate());
            System.out.println(calculation.getResult());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
