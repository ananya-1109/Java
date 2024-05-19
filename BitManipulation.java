import java.util.Scanner;

public class BitManipulation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        // get bit
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

        // set bit
        int n1 = 5;
        int pos1 = 1;
        int bitMask1 = 1 << pos1;

        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);

        // clear bit
        int n2 = 5;
        int pos2 = 2;
        int bitMask2 = 1 << pos2;
        int notBitMask = ~(bitMask2);

        int newNumber1 = notBitMask & n2;
        System.out.println(newNumber1);

        // update
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int n3 = 5;
        int pos3 = 1;

        int bitMask3 = 1 << pos3;
        if (oper == 1) {
            // set
            int newNumber3 = bitMask3 | n3;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask3);
            int newNumber3 = newBitMask & n3;
            System.out.println(newNumber3);
        }
        sc.close();
    }
}
