import java.util.Iterator;
import java.util.LinkedList;

public class LinklistDemo {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList();
        ll.add("RAm");
        ll.add("Sam");
        ll.add("ytty");
        ll.add("ghjh");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
