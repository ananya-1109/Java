public class CompareStrings {
    public static void main(String args[]) {
        // compare
        String name1 = "abc";
        String name2 = "efg";

        // 1 s1>s2:=ve vlue
        // 2 s1==s2:0
        // 3 s1<s2:-ve value
        // hello<wello hello>cello
        if (name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        String sentence = name1.substring(1, name1.length());
        System.out.println(sentence);
    }
}
