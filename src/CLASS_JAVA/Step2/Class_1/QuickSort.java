package CLASS_JAVA.Step2.Class_1;

import java.util.Arrays;

public class QuickSort {
    public int[] quicksort(int[] queue) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(queue, queue.length);

        return Sort(arr, 0, arr.length - 1);
    }

    private int[] Sort(int[] arr, int left, int right) {
        if (left < right) {
            System.out.println("排序:["+left+":"+right+"]");
            int partitionIndex = partition(arr, left, right);//partitionIndex表示回到正确位置后的基准值的位置
            System.out.println("位置:"+partitionIndex+"已固定");
            System.out.println();
            System.out.println("对"+partitionIndex+"位置左侧子序列["+left+","+(partitionIndex - 1)+"]进行排序");
            Sort(arr, left, partitionIndex - 1);//先看确定位置后的基准值的左边,不含基准值位置
            System.out.println("对"+partitionIndex+"位置右侧子序列["+(partitionIndex + 1)+","+right+"]进行排序");
            Sort(arr, partitionIndex + 1, right);//先看确定位置后的基准值的右边,不含基准值位置
        }
        else
        {
            if(left==right)
            {
                System.out.println("位置:"+left+"已固定");
                System.out.println();
            }
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;//寻找基准值后面最小的,然后浮上来
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                System.out.println("交换前"+"基准值为"+pivot+":"+arr[pivot]+"\t index为"+index+":"+arr[index]+"\t i为"+i+":"+arr[i]+"\t"+Arrays.toString(arr));
                swap(arr, i, index);//如果发现比基准值小的值,则该值与index位置互换
                System.out.println("交换后"+"基准值为"+pivot+":"+arr[pivot]+"\t index为"+index+":"+arr[index]+"\t i为"+i+":"+arr[i]+"\t"+Arrays.toString(arr));
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        System.out.println("交换基准值:\t"+"基准值为"+(index-1)+":"+arr[index-1]+"\t index为"+index+"\t"+Arrays.toString(arr));
        return index - 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
