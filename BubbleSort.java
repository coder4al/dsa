import java.util.Arrays;

public class BubbleSort {

    void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 0, 1, 3, 6, 8, 9, 7, 4 };
        System.out.println("Before sorting : " + Arrays.toString(nums));
        new BubbleSort().bubbleSort(nums);
        System.out.println("After sorting : " + Arrays.toString(nums));
    }
}
