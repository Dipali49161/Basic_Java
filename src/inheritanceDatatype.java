/*class Adder
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}
public class inheritanceDatatype
{
    public static void main(String args[])
    {
        System.out.println(Adder.add(12,23));
        System.out.println(Adder.add(30,40));
    }
}*/

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, int b) {
        return a + b;
    }
}

class InheritanceDatatype {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));//ambiguity
    }
}
