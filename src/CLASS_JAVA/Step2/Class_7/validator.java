package CLASS_JAVA.Step2.Class_7;

public class validator {
    public boolean vali(String UID){
        if (UID.equals("李四")){
            System.out.println(UID+"修改成功");
            return true;
        }
        else {
            System.out.println("对不起"+UID+"无权修改商品名称");
            return false;
        }
    }
}
