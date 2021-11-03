interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable rr = new Rectangle();
        rr.draw();
    }
}
