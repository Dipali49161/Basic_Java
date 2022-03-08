import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get element
        int element = list.get(1);
        System.out.println(element);
        //add element in between
        list.add(1, 1);
        list.add(4, 4);
        System.out.println(list);
        list.set(0, 7);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        //using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        //Sorting the element
        Collections.sort(list);
        System.out.println(list);
    }

}
