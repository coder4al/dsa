import java.util.Arrays;

public class InsertionSort {
    void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                int tmp = arr[i];
                while(i > 0 && arr[i-1] > tmp)
                    arr[i]=arr[--i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 0, 1, 3, 6, 8, 9, 7, 4 };
        System.out.println("Before sorting : " + Arrays.toString(nums));
        new InsertionSort().insertionSort(nums);
        System.out.println("After sorting : " + Arrays.toString(nums));
    }
}