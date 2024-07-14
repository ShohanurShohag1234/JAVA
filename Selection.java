import java.util.*;

public class Merge {
    static void merge(int A[], int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (A[i] < A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = A[i++];
        }

        while (j <= high) {
            temp[k++] = A[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            A[i] = temp[k];
        }
    }

    static void merge_sort(int A[], int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            merge_sort(A, low, mid);
            merge_sort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    static void print(int A[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int A[] = new int[5];
        System.out.println("Enter the elements:");
        for (int i = 0; i < A.length; i++) {
            A[i] = b.nextInt();
        }
        System.out.print("Original Array:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i]);
        }

        merge_sort(A, 0, A.length - 1);
        System.out.println("Sorted Array: ");
        print(A, A.length);
    }
}
