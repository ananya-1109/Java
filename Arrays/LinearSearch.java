import java.util.*;

public class LinearSearch {

    public static void searchIndex(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("element found at index:" + i);
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the index to be searched:");
        int n = sc.nextInt();
        searchIndex(arr, n);

        sc.close();
    }
}
