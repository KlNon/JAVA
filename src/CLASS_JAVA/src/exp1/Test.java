package CLASS_JAVA.src.exp1;

public class Test {
    public static void main(String[] args){
        Car car = new Benz();
        new Driver("ZhangSan").drive(car);
        car = new BMW();
        new Driver("LiSi").drive(car);
        car = new Volks();
        new Driver("WangWu").drive(car);

    }
}
