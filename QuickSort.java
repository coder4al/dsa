import java.util.Arrays;

public class QuickSort {

    void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int pivot = arr[high];
        int start = low, end = high-1;

        while (start <= end) {
            if (arr[start] > pivot) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                end--;
            } else {
                start++;
            }
        }

        arr[high] = arr[start];
        arr[start] = pivot;

        quickSort(arr, low, start-1);
        quickSort(arr, start+1, high);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 0, 1, 3, 6, 8, 9, 7, 4 };
        System.out.println("Before sorting : " + Arrays.toString(nums));
        new QuickSort().quickSort(nums, 0, nums.length - 1);
        System.out.println("After sorting : " + Arrays.toString(nums));
    }
}
