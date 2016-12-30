package arrays;

/**
 * Created by amitkumar on 06/12/16.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length-1;
        int element = 0;
        System.out.println(findElement(start, end, arr, element));
    }

    private static int findElement(int start, int end, int[] arr, int element) {
        int mid = start + (end-start)/2;
        if (mid > end || mid < start) {
            return -1;
        }
        if (arr[mid] == element) {
            return mid;
        }
        else if (arr[mid] < element) {
            return findElement(mid+1, end, arr, element);
        }
        else {
            return findElement(start, mid-1, arr, element);
        }
    }
}
