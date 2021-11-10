package CLASS_JAVA.Step2.Class_5.Componet;

public class NatieCoffee extends Coffee{
    public NatieCoffee()
    {
        this.setPrice(10);
    }
    @Override
    public void operate() {
        System.out.println("拿铁咖啡价格为: "+this.getFprice());
        this.setFprice(this.getPrice());
    }
}
