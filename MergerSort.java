import java.util.Arrays;

public class MergerSort {
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    public void merge(int[] arr, int start, int end, int mid) {
        int[] tmp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }

        while (i <= mid)
            tmp[k++] = arr[i++];

        while (j <= end)
            tmp[k++] = arr[j++];

        k = start;

        for (int num : tmp) {
            arr[k++] = num;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 0, 1, 3, 6, 8, 9, 7, 4 };
        System.out.println("Before sorting : " + Arrays.toString(nums));
        new MergerSort().mergeSort(nums, 0, nums.length - 1);
        System.out.println("After sorting : " + Arrays.toString(nums));
    }
}