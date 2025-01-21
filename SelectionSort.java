import java.util.Arrays;

public class SelectionSort {

    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 0, 1, 3, 6, 8, 9, 7, 4 };
        System.out.println("Before sorting : " + Arrays.toString(nums));
        new SelectionSort().selectionSort(nums);
        System.out.println("After sorting : " + Arrays.toString(nums));
    }
}
