package CLASS_JAVA.Step3.Class_2;

import CLASS_JAVA.Step3.Class_2.Approver.Approver;
import CLASS_JAVA.Step3.Class_2.Approver.A;
import CLASS_JAVA.Step3.Class_2.Approver.B;
import CLASS_JAVA.Step3.Class_2.Approver.C;

import java.util.Collections;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Approver a,b,c;
        int i=10;
        a=new A("A",i);
        b=new B("B",i);
        c=new C("C",i);

        a.setSuccessor(b);
        b.setSuccessor(c);
        c.setSuccessor(a);

        System.out.println("请开始输入数字1、2、3投色字决定谁先出牌,数字1表示A先出牌,数字2表示B先出牌,数字3表示C先出牌");
        Scanner scanner=new Scanner(System.in);
        Approver approver=null;
        String name = null;
        switch (scanner.nextInt())
        {
            case 1->approver=a;
            case 2-> approver=b;
            case 3-> approver=c;
            default -> name="未知用户";
        }
        assert approver != null;
        System.out.println(approver.name+"是首先出牌的");
        approver.processRequest();
    }
}
