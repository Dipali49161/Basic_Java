public class StringExample {
    public static void main(String args[]) {
        String s1 = "Dipali";
        char[] ch1 = {'s', 'a', 'g', 'a', 'r'};
        char[] ch = {'A', 'v', 'h', 'a', 'd'};
        String s2 = new String(ch);
        String s4 = new String(ch1);
        String s3 = new String("made for each other");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s3);

    }
}
