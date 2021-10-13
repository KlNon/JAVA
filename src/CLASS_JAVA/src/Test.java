package CLASS_JAVA.src;

class A{
    int i;

    public void setI(int i) {
        this.i = i;
    }
}

class B{
    A a;

    public void setA(A a) {
        this.a = a;
    }
}


public class Test {
    public static void main(String[] args){
        B b = new B();
        A a = new A();
        b.setA(a);
        a.setI(100);
        System.out.println(b.a.i);
    }
}
