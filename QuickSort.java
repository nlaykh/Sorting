import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        init(arr);
        //System.out.println(Arrays.toString(arr));
        double start = System.currentTimeMillis();
        quickSort(arr);
        double end = System.currentTimeMillis();
        System.out.printf("Ellapsed time is: %f seconds\n", end-start);
        //System.out.println(Arrays.toString(arr));
    }


    public static void init(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(100000);
    }

    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);

        int leftPointer = partition(arr, lowIndex, highIndex);
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    public static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    public static int partition(int[] arr, int low, int high) {
        int leftPointer = low;
        int rightPointer = high;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= arr[high] && leftPointer < rightPointer)
                leftPointer++;
            while (arr[rightPointer] >= arr[high] && leftPointer < rightPointer)
                rightPointer--;
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, high);
        return leftPointer;
    }


}
