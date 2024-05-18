import java.util.*;

public class sum {
    public static void main(String args[]) {
        int a = 10;
        int b = 25;
        int add = a + b;
        System.out.println(add);
        int diff = a - b;
        System.out.println(diff);

        // to take input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int s = x + y;
        System.out.println(s);

        sc.close();
    }
}
