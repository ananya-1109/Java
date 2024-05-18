import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // switch case
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");
        }
        sc.close();
    }
}
