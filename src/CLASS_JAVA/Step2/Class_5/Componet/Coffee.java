package CLASS_JAVA.Step2.Class_5.Componet;

abstract public class Coffee {
    private int price;
    private int fprice;

    abstract public void operate();
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        this.setFprice(this.getPrice());
    }

    public int getFprice() {
        return fprice;
    }

    public void setFprice(int fprice) {
        this.fprice = fprice;
    }
}
