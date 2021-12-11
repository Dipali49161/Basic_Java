import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("priya");
        list.add("Sonali");
        list.add("Dips");
        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

