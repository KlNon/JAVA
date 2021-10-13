package CLASS_JAVA.Class_1;

public class Driver {
    public String Name;
    public void drive(Car car)
    {
        System.out.println("司机正在开"+car.getName());
    }

    public static void main(String[] args) {
        Driver driver=new Driver();
        driver.drive(new Bmp());
        driver.drive(new bc());
        driver.drive(new dz());
    }
}
