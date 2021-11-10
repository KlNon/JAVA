package CLASS_JAVA.Step2.Class_5.Decorator;

import CLASS_JAVA.Step2.Class_5.Componet.Coffee;

abstract public class CoffeeDector extends Coffee {
    private Coffee coffee;

    public CoffeeDector(Coffee coffee)
    {
        this.coffee=coffee;
    }

    public void operate(){
        coffee.setFprice(coffee.getFprice()+this.getFprice());
        coffee.operate();
    }
}
