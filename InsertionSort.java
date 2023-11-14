import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        init(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void init(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(100);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
