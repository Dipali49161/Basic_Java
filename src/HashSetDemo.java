import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        set.add("dipa");
        set.add("sagar");
        set.add("sona");
        set.add("Dipa");
        set.add("sagar");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
