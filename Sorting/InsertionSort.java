public class InsertionSort {
    public static void insertionSort(int A[]) {
        for (int i = 1; i < A.length; i++) {
            int current = A[i];
            int j = i - 1;
            while (j >= 0 && current < A[j]) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = current;
        }
    }

    public static void printArray(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };
        insertionSort(arr);
        printArray(arr);
    }
}
