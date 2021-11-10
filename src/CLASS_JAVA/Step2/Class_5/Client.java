package CLASS_JAVA.Step2.Class_5;

import CLASS_JAVA.Step2.Class_5.Componet.*;
import CLASS_JAVA.Step2.Class_5.Decorator.Milk;
import CLASS_JAVA.Step2.Class_5.Decorator.Orange;

public class Client {

    public static void main(String[] args) {
        Coffee a=new BlueCoffee();
        Coffee b=new NatieCoffee();
        Coffee c=new Milk(a);
        Coffee d=new Orange(b);
        Coffee e=new Orange(c);
        c.operate();
        d.operate();
        e.operate();
    }
}
