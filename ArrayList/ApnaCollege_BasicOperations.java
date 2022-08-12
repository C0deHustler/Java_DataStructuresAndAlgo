import java.util.ArrayList;
import java.util.Collections;

public class ApnaCollege_BasicOperations {
    public static void main(String[] args) {
        // Declaration of ArrayLists
        // Method-1
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        // Method-2
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();

        // add elements (new elements are added at the tail)
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        System.out.println(list1);

        // get elements
        int element = list1.get(2); // to get element at index 2 (3rd element)  of ArrayLists list1 ( 0-based indexing)
        System.out.println(element);

        // add element in between 2 elements
        list1.add(1, 3);    // element 3 will be added at the index 1, and rest of the elements will move forward
        System.out.println(list1);

        // set element (to update an already existing element)
        list1.set(4, 10);   // 8 will be updated to 10 at index 4 of list1
        System.out.println(list1);

        // delete element
        list1.remove(1);    // element at index 1 will be deleted
        System.out.println(list1);

        // size of ArrayList
        int size = list1.size();
        System.out.println(size);

        // For loop iteration
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        // Sorting
        list4.add(8.33f);   // f must be used at the end of each float datatype values
        list4.add(3.12f);
        list4.add(1.65f);
        list4.add(6.879f);
        Collections.sort(list4);    // we need to import Collections Class for using this sort method
        System.out.println(list4);
    }
}
