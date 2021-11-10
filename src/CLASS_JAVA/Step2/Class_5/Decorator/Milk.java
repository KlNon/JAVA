package CLASS_JAVA.Step2.Class_5.Decorator;

import CLASS_JAVA.Step2.Class_5.Componet.Coffee;

public class Milk extends CoffeeDector{
    public Milk(Coffee coffee) {
        super(coffee);
        this.setPrice(2);
    }

    @Override
    public void operate() {
        this.setDecorator();
        super.operate();
    }

    public void setDecorator() {
        System.out.print("加了牛奶");
    }
}
