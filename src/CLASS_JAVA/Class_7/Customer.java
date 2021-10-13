package CLASS_JAVA.Class_7;

import java.io.*;

abstract public class Customer implements Cloneable,Serializable{
    private String ID;
    private String name;
    private String age;
    private Address address;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Customer clone() {
        Object obj;
        try{
            obj=super.clone();
            return (Customer) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("Clone fail");
            return null;
        }
    }

    public void inf() {
        System.out.println("客户"+ID+":" +
                "姓名='" + name + '\'' +
                ", 年龄='" + age + '\'' +
                ", 住址='" + getAddress().address());
    }
}
