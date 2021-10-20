package CLASS_JAVA.Step2.Class_1;

public class Adapter implements DataOperation {
    private static final QuickSort quickSort=new QuickSort();
    private static final BinarySearch binarySearch=new BinarySearch();

    @Override
    public void sort(int[] queue) {
        try {
            quickSort.quicksort(queue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int search(int[] queue, int num) {
        binarySearch.binarySearch(queue, num);
        return queue[num];
    }
}
