public class ParaConstructor {
    int rollno;
    String name;

    ParaConstructor(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + "\t" + name);
    }

    public static void main(String args[]) {
        ParaConstructor pp = new ParaConstructor(111, "Dipa");
        ParaConstructor p1 = new ParaConstructor(112, "Sagar");
        p1.display();
        pp.display();

    }


}

