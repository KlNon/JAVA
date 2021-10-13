package CLASS_JAVA.src.exp1;


public class Driver {
    private String name;

    public Driver(String name){
        this.name = name;
    }

    public void drive(Car car){
        System.out.print(name);
        car.move();
    }
}
