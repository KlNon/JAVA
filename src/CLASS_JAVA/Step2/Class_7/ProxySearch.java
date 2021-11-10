package CLASS_JAVA.Step2.Class_7;

public class ProxySearch implements Search {
    private RealSearch order =new RealSearch();
    @Override
    public String search(String productName, int productNum, String customerName) {
        if(this.vali(customerName)){
            String result=order.search(productName, productNum, customerName);

            this.alter(productName,productNum);
            return result;
        }
        return null;
    }

    public boolean vali(String customerName){
        validator vali=new validator();
        return vali.vali(customerName);
    }

    public void alter(String productName,int productNum){
        Orders orders=new Orders();
        orders.alter(productName, productNum);
    }
}
