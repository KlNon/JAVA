package CLASS_JAVA.Step2.Class_1;

import java.util.Arrays;

public class Adapter implements DataOperation {
    private static final QuickSort quickSort=new QuickSort();

    @Override
    public int[] sort(int[] queue) {
        try {
            return quickSort.quicksort(queue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return queue;
    }

    @Override
    public int search(int[] queue, int num) {
        return Arrays.binarySearch(queue,num);
    }
}
