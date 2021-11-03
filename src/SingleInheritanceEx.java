class Elephant {
    void bark() {
        System.out.println("barking....");
    }

}

class Cats extends Elephant {
    void eat() {
        System.out.println("eating...");
    }

}

public class SingleInheritanceEx {
    public static void main(String args[]) {
        Cats cc = new Cats();
        cc.eat();
        cc.bark();
        //System.out.println();
    }
}
