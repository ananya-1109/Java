public class QuickSort {
    public static int partition(int A[], int l, int h) {
        int pivot = A[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (A[j] < pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        i++;
        int temp = A[i];
        A[i] = pivot;
        A[h] = temp;
        return i;
    }

    public static void quickSort(int A[], int l, int h) {
        if (l < h) {
            int pivotindex = partition(A, l, h);
            quickSort(A, l, pivotindex - 1);
            quickSort(A, pivotindex + 1, h);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
