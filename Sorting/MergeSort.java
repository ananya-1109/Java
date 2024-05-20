public class MergeSort {
    public static void conquer(int A[], int l, int mid, int h) {
        int merged[] = new int[h - l + 1];

        int index1 = l;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= h) {
            if (A[index1] <= A[index2]) {
                merged[x++] = A[index1++];
            } else {
                merged[x++] = A[index2++];
            }
        }
        while (index1 <= mid) {
            merged[x++] = A[index1++];
        }
        while (index2 <= h) {
            merged[x++] = A[index2++];
        }
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            A[j] = merged[i];
        }
    }

    public static void divide(int A[], int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = l + (h - l) / 2;

        divide(A, l, mid);
        divide(A, mid + 1, h);
        conquer(A, l, mid, h);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
