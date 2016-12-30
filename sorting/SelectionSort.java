package sorting;

/**
 * Created by amitkumar on 06/12/16.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 22, 33, 44, 11, 11};

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = findMinimum(arr, i+1, arr.length-1);
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int findMinimum(int[] arr, int start, int end) {
        int smallestIndex = start-1;
        for (int j = start; j <= end; j++) {
            if (arr[j] < arr[smallestIndex]) {
                smallestIndex = j;
            }
        }

        return smallestIndex;
    }
}
