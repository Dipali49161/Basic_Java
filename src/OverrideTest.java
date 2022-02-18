class TestData {
    void run() {
        System.out.println("hello");
    }
}

class OverrideTest extends TestData {
    void run() {
        System.out.println("Example of method overriding");
    }

    public static void main(String args[]) {
        OverrideTest o = new OverrideTest();
        o.run();

    }
}
