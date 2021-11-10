package CLASS_JAVA.Step2.Class_7;

public class Client {
    public static void main(String[] args) {
        Search search;
        search=(Search)XMLUtil.getBean();
        String result=search.search("阿迪达斯鞋子",120,"张三");
        String result2=search.search("阿迪达斯鞋子",120,"李四");
    }
}
