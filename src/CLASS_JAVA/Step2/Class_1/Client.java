package CLASS_JAVA.Step2.Class_1;

import java.util.Arrays;

public class Client {
    private static final int[] queue={5,7,3,2,1};
    public static void main(String[] args) {
        Adapter adapter=new Adapter();
        adapter.sort(queue);
        System.out.println("排序结果为:"+Arrays.toString(queue));
        int searchResult=adapter.search(queue,3);
        System.out.println("查询结果为:"+searchResult);
    }
}
