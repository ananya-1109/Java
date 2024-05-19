import java.util.*;

public class LinearSearchTwoD {
    public static void searchElement(int A[][], int rows, int cols, int x) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] == x) {
                    System.out.println("element found at index:(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // input
        // rows
        System.out.println("enter the values:");
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("the array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter elemnet to be searched:");
        int n = sc.nextInt();
        searchElement(numbers, rows, cols, n);

        sc.close();
    }
}
