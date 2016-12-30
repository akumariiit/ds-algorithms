package sorting;

/**
 * Created by amitkumar on 29/12/16.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 22, 33, 44, 11, 11};

        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int ind = findIndex(arr, i);
            System.out.println("index == " + ind);
            if (ind != -1) {
                int temp = arr[i];
                shiftElements(arr, ind, i);
                arr[ind] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void shiftElements(int[] arr, int ind, int i) {
        for (int j = i; j > ind; j--) {
            arr[j] = arr[j-1];
        }
    }

    private static int findIndex(int[] arr, int ind) {
        for (int i = 0; i < ind; i++) {
            if (arr[i] > arr[ind]) {
                return i;
            }
        }
        return -1;
    }
}
