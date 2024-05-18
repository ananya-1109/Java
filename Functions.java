import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers is:" + sum);

        int X = sc.nextInt();
        printFactorial(X);
    }
}
