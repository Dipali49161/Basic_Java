class Headmaster {
    float salary = 10000;
}

public class InheritanceTest extends Headmaster {
    int bonas = 2000;

    public static void main(String args[]) {
        InheritanceTest t = new InheritanceTest();
        System.out.println("Headmaster salary is:" + t.salary);
        System.out.println("bonus is:" + t.bonas);
    }
}
