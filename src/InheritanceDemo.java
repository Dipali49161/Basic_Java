public class InheritanceDemo {
    float salary = 15000;
}

class Tester extends InheritanceDemo {
    int bonus = 20000;

    public static void main(String args[]) {
        Tester t = new Tester();
        System.out.println("Salary of tester is:" + t.salary);
        System.out.println("Bonus of Tester is:" + t.bonus);
    }
}
