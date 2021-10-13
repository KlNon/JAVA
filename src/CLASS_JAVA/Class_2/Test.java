package CLASS_JAVA.Class_2;

public class Test {
    public static void main(String[] args) {
        Factory factory=new Factory();
        try {
            System.out.println(factory.CreateCalculation("+").getResult());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
