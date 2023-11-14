import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] arr = {15,14,13,12,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }

    public static void bubbleSortRecursive(int[] arr) {
        bubbleSortRec(arr, arr.length);
    }

    public static void bubbleSortRec(int[] arr, int length) {
        if (length == 1)
            return;
        for (int i = 0; i < length-1; i++)
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        bubbleSortRec(arr, length-1);
    }

    public static void recursiveInsertionSort(int arr[], int len){
        if (len <= 1)
            return;
        recursiveInsertionSort(arr, len -1 );
        int key = arr[len -1];
        int j = len -2;
        while (j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; ++i) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            swap(arr, minIdx, i);
        }
    }
    public static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}


