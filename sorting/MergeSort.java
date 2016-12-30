package sorting;

/**
 * Created by amitkumar on 30/12/16.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 22, 33, 44, 11, 11};

        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int mid = (l+r)/2;
        System.out.println("mid == " + mid + " l and r " + l + " " + r);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int s1 = l;
        int s2 = mid+1;
        int e1 = mid;
        int e2 = r;
        int[] res = new int[r-l+1];
        int i = 0;
        while (s1 <= mid && s2 <= r) {
            if (arr[s1] <= arr[s2]) {
                res[i++] = arr[s1++];
            }
            else {
                res[i++] = arr[s2++];
            }
        }
        if (s1 <= mid) {
            while (s1 <= mid) {
                res[i++] = arr[s1++];
            }
        }
        if (s2 <= r) {
            while (s2 <= r) {
                res[i++] = arr[s2++];
            }
        }
        int x = 0;
        for (int j = l; j <= r; j++) {
            arr[j] = res[x++];
        }
    }
}
