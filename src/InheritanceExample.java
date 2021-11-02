class Dog
{
    void eat()
    {
        System.out.println("eating......");
    }
}

    class Animal extends Dog
    {
        void bark() {
            System.out.println("Barking....");
        }
    }
    public class InheritanceExample
    {

    public static void main(String args[])
    {


        Animal a = new Animal();
        a.bark();
        a.eat();
    }
}

