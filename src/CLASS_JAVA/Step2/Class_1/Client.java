package CLASS_JAVA.Step2.Class_1;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
    private static int[] queue={5,7,3,2,1};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Adapter adapter=new Adapter();
        int[] temp=queue;
        int num=0;
        queue=adapter.sort(queue);
        System.out.println("未排序前为:"+Arrays.toString(temp));
        System.out.println("排序结果为:"+Arrays.toString(queue));
        System.out.println("请输入你想查询的数.");
        if(scanner.hasNextInt())
            num=scanner.nextInt();
        int searchResult=adapter.search(queue,num);//查询的是具体值
        System.out.println("数字"+num+"的索引为:"+searchResult);
    }
}
