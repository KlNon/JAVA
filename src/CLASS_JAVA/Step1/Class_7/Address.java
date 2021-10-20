package CLASS_JAVA.Step1.Class_7;

import java.io.Serializable;

public class Address implements Serializable {
    private String addressName;
    private String mailCode;

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getMailCode() {
        return mailCode;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode;
    }

    public String address(){
        return addressName+",邮编为:"+mailCode;
    }
}
