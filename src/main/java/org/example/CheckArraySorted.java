package org.example;

public class CheckArraySorted {
    public static void main(String[] args) {
        int array[] = {1, 21, 564, 32090};
        int n = array.length;
        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {  // Loop until the second-to-last element
            if (array[i] > array[i + 1]) {  // Compare the current element with the next one
                isSorted = false;
                break;  // Exit the loop if the array is not sorted
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}
