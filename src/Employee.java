class Student1{
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

}
class Employee{

    public static void main(String args[])
    {
        System.out.println(Student1.add(10,20));
        System.out.println(Student1.add(10,20,30));
    }
}
