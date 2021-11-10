package CLASS_JAVA.Step2.Class_5.Componet;

public class BlueCoffee extends Coffee{
    public BlueCoffee(){
        this.setPrice(8);
    }
    @Override
    public void operate() {
        System.out.println("蓝山咖啡价格为: "+this.getFprice());
        this.setFprice(this.getPrice());
    }
}
