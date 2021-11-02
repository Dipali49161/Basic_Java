 class Student
{
    int rollno;
    String name;
    static String college = "SMBST";
    static void change()
    {
        college= "Pravara";
    }
    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display() {


        System.out.println(rollno + "\t" + name + "\t" + college);
    }
}
   public class StaticMethodEx {


        public static void main(String args[]) {
            Student.change();
            Student se = new Student(111, "karan");
            Student se1 = new Student(222, "Sagar");
            Student se2 = new Student(333, "Dipali");
            se.display();
            se1.display();
            se2.display();

        }
    }

