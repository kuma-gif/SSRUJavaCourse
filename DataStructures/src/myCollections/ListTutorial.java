package myCollections;

import java.util.ArrayList;
import java.util.List;

public class ListTutorial {
    public static void main() {
        // Create ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(40);
        list.add(99);

        System.out.println(list);

        // Read ArrayList
        int ele2 = list.get(2);
        System.out.println("Element at 2: " + ele2);

        // Update ArrayList
        list.set(2, 180);
        System.out.println("(updated) Element at 2: " + list.get(2));

        // Delete element in ArrayList
        list.remove(2);
        System.out.println("After deleted: " + list);
    }
}
