import java.util.Arrays;

public class Bubblesort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
