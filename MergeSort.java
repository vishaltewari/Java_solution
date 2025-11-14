/**
 * MergeSort Implementation
 * 
 * Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves,
 * recursively sorts them, and then merges the two sorted halves.
 * 
 * Time Complexity: O(n log n) in all cases (best, average, and worst)
 * Space Complexity: O(n) for the temporary array used during merging
 */
public class MergeSort {
    
    /**
     * Sorts an array using the merge sort algorithm
     * @param arr The array to be sorted
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSortHelper(arr, 0, arr.length - 1);
    }
    
    /**
     * Recursive helper method for merge sort
     * @param arr The array to be sorted
     * @param left The starting index of the subarray
     * @param right The ending index of the subarray
     */
    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;
            
            // Sort first and second halves
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    
    /**
     * Merges two sorted subarrays of arr[]
     * First subarray is arr[left..mid]
     * Second subarray is arr[mid+1..right]
     * @param arr The array containing the subarrays
     * @param left The starting index of the first subarray
     * @param mid The ending index of the first subarray
     * @param right The ending index of the second subarray
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        // Calculate sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        
        // Merge the temporary arrays back into arr[left..right]
        int i = 0; // Initial index of first subarray
        int j = 0; // Initial index of second subarray
        int k = left; // Initial index of merged subarray
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    /**
     * Utility method to print an array
     * @param arr The array to print
     */
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * Main method to demonstrate merge sort
     */
    public static void main(String[] args) {
        System.out.println("Merge Sort Implementation\n");
        
        // Test case 1: Random array
        int[] arr1 = {12, 11, 13, 5, 6, 7};
        System.out.println("Test Case 1 - Random Array:");
        System.out.print("Original array: ");
        printArray(arr1);
        mergeSort(arr1);
        System.out.print("Sorted array:   ");
        printArray(arr1);
        System.out.println();
        
        // Test case 2: Already sorted array
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 2 - Already Sorted:");
        System.out.print("Original array: ");
        printArray(arr2);
        mergeSort(arr2);
        System.out.print("Sorted array:   ");
        printArray(arr2);
        System.out.println();
        
        // Test case 3: Reverse sorted array
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 3 - Reverse Sorted:");
        System.out.print("Original array: ");
        printArray(arr3);
        mergeSort(arr3);
        System.out.print("Sorted array:   ");
        printArray(arr3);
        System.out.println();
        
        // Test case 4: Array with duplicates
        int[] arr4 = {3, 7, 3, 1, 9, 7, 2};
        System.out.println("Test Case 4 - Array with Duplicates:");
        System.out.print("Original array: ");
        printArray(arr4);
        mergeSort(arr4);
        System.out.print("Sorted array:   ");
        printArray(arr4);
        System.out.println();
        
        // Test case 5: Single element
        int[] arr5 = {42};
        System.out.println("Test Case 5 - Single Element:");
        System.out.print("Original array: ");
        printArray(arr5);
        mergeSort(arr5);
        System.out.print("Sorted array:   ");
        printArray(arr5);
        System.out.println();
        
        // Test case 6: Empty array
        int[] arr6 = {};
        System.out.println("Test Case 6 - Empty Array:");
        System.out.print("Original array: ");
        printArray(arr6);
        mergeSort(arr6);
        System.out.print("Sorted array:   ");
        printArray(arr6);
        System.out.println();
        
        // Test case 7: Large array
        int[] arr7 = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Test Case 7 - Larger Array:");
        System.out.print("Original array: ");
        printArray(arr7);
        mergeSort(arr7);
        System.out.print("Sorted array:   ");
        printArray(arr7);
    }
}
