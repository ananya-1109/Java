public class SelectionSort {
    public static void selectionSort(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[smallest] > A[j]) {
                    smallest = j;
                }
            }
            int temp = A[smallest];
            A[smallest] = A[i];
            A[i] = temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}
