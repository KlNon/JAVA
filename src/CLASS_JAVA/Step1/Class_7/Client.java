package CLASS_JAVA.Step1.Class_7;


import CLASS_JAVA.Step1.Class_7.customers.A;

public class Client{

    public static void main(String[] args){
        Customer A=new A();
        Address address=new Address();
        address.setAddressName("开福区洪山路98号");
        address.setMailCode("414000");
        A.setID("A");
        A.setName("张三");
        A.setAge("20");
        A.setAddress(address);

        try {

            System.out.println("--------------------浅克隆--------------------");
            Customer A1=A.clone();
            System.out.println("浅克隆 clone() A=A1?:\t"+(A==A1));
            System.out.println("浅克隆 clone() A.address=A1.address?:\t"+(A.getAddress()==A1.getAddress()));
            System.out.println();
            System.out.print("原对象信息为:\t");
            A.inf();
            System.out.print("浅克隆对象为:\t");
            A1.inf();

            System.out.println("--------------------修改原对象姓名和地址--------------------");
            address.setAddressName("长沙学院");
            A.setName("李四");
            A.setAddress(address);
            System.out.print("原对象为:\t");
            A.inf();
            System.out.print("浅克隆对象为:\t");
            A1.inf();

            A.setName("张三");
            System.out.println("--------------------深克隆--------------------");
            A1=CloneUtil.clone(A);
            System.out.println("深克隆 deepClone() A=A1?:\t"+(A==A1));
            System.out.println("深克隆 deepClone() A.address=A1.address?:\t"+(A.getAddress()==A1.getAddress()));
            System.out.println();
            System.out.print("原对象为:\t");
            A.inf();
            System.out.print("深克隆对象为:\t");
            A1.inf();
            System.out.println("--------------------修改原对象地址--------------------");
            address.setAddressName("开福区洪山路98号");
            A.setAddress(address);
            System.out.print("原对象为:\t");
            A.inf();
            System.out.print("深克隆对象为:\t");
            A1.inf();
        }catch (Exception e){
            System.out.println("克隆错误");
        }
    }
}
