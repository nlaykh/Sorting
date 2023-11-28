# Java Sorting Algorithms

This repository contains implementations of various sorting algorithms in Java.

## Sorting Algorithms

- [InsertionSort](InsertionSort.java): Implementation of the Insertion Sort algorithm.
- [MergeSort](MergeSort.java): Implementation of the Merge Sort algorithm.
- [QuickSort](QuickSort.java): Implementation of the Quick Sort algorithm.
- [Sorts](Sorts.java): Utility class containing methods for different sorting algorithms.

## How to Use

Each Java file contains an implementation of a specific sorting algorithm. You can include these files in your Java project and use the methods accordingly.

### Example

```java
// Example of using QuickSort
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 3};
        QuickSort.quickSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
