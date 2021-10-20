package CLASS_JAVA.Step2.Class_1;

public class Client {
    private static final int[] queue={5,7,3,2,1};
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.sort(queue);
//        adapter.search(queue,3);
    }
}
