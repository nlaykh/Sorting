import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {15,14,12,10,9,6,3};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1)
            return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; ++i)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i-mid] = arr[i];
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j=0, k=0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < nL)
            arr[k++] = left[i++];
        while (j < nR)
            arr[k++] = right[j++];
    }
}
