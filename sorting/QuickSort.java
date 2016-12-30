package sorting;

/**
 * Created by amitkumar on 30/12/16.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 22, 33, 44, 11, 11};

        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end)
            return;
        int p = findPivotIndex(arr, start, end);
        quickSort(arr, start, p-1);
        quickSort(arr, p+1, end);
    }

    // assuming first element as pivot
    private static int findPivotIndex(int[] arr, int start, int end) {
        int p = arr[start];
        int h = end+1;
        for (int j = end; j > start; j--) {
            if (arr[j] > p) {
                h--;
                int temp = arr[j];
                arr[j] = arr[h];
                arr[h] = temp;
            }
        }
        int temp = p;
        arr[start] = arr[h-1];
        arr[h-1] = p;
        return h-1;
    }

    // assuming last element as pivot
    private static int findPivotIndex2(int[] arr, int start, int end) {
        int pivot = arr[end];

        int h = start - 1;
        for (int j = start; j < start; j++) {
            if (arr[j] <= pivot) {
                h++;
                int temp = arr[j];
                arr[j] = arr[h];
                arr[h] = temp;
            }
        }
        int temp = pivot;
        arr[end] = arr[h+1];
        arr[h+1] = pivot;
        return h+1;
    }
}
