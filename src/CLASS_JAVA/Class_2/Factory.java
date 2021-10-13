package CLASS_JAVA.Class_2;

import CLASS_JAVA.Class_2.cal.*;

import java.util.Scanner;

public class Factory {
    public Calculation CreateCalculation(String cal) throws MyException{
        Calculation calculation;
        Scanner scanner= new Scanner(System.in);
        double tempArg;

        System.out.println("请输入一个数");
        try {
            tempArg=(scanner.nextDouble());
        }catch(Exception e){
            throw new MyException("不为数字");
        }

        System.out.println("请输入+-*/任意一个字符");
        cal=scanner.next();
        switch (cal) {
            case "+" ->
                calculation = new Add();
            case "-" ->
                calculation = new Sub();
            case "*" ->
                calculation = new Mul();
            case "/" ->
                calculation = new Div();
            default ->
                throw new MyException("未知符号,目前仅支持加减乘除(+,-,*,/)");
        }

        calculation.setArg1(tempArg);
        System.out.println("请输入一个数");
        try {
            calculation.setArg2(scanner.nextDouble());
            if(calculation.getArg2()==0)
                throw new MyException();
        }catch(Exception e){
            if(calculation.getArg2()==0)
                throw new MyException("被除数不能为0");
            throw new MyException("不为数字");
        }

        calculation.setResult(calculation.calculate(calculation.getArg1(),calculation.getArg2()));
        return calculation;
    }
}
