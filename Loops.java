public class Loops {
    public static void main(String args[]) {
        for (int counter = 0; counter < 3; counter++) { // counter=counter+1
            System.out.println("Hello World");
        }

        for (int counter = 0; counter < 6; counter++) { // counter=counter+1
            System.out.println(counter);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
        }

        int j = 0;
        do {
            System.out.println(j);
            j = j + 1;
        } while (i < 3);
    }
}
