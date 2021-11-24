package CLASS_JAVA.Step3.Class_1;

import CLASS_JAVA.Step3.Class_1.Approver.*;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Approver zr,jl,zjl;
        zr=new Director("主任");
        jl=new Manager("经理");
        zjl=new President("总经理");

        zr.setSuccessor(jl);
        jl.setSuccessor(zjl);
        int i=1;
        while(true){
            System.out.println();
            System.out.println("请输入请假天数");
            Scanner scanner=new Scanner(System.in);
            i=scanner.nextInt();
            if(i==0)
                break;
            Note note=new Note(i);
            zr.processRequest(note);
        }
    }
}
