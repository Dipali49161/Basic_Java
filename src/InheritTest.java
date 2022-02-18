class Test1 {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class InheritTest {
    public static void main(String args[]) {
        InheritanceTest t = new InheritanceTest();
        System.out.println(Test1.add(10, 20));
        System.out.println(Test1.add(20, 30, 40));
    }
}
