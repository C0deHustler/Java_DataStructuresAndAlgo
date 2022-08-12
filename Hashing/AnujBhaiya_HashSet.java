import java.util.*;
// Problem and Explanation - https://www.youtube.com/watch?v=K7BTtcU0n-Q&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=26
public class AnujBhaiya_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println("Elements in a HashSet are stored in an unordered way : "+hs);

        hs.add(30);
        System.out.println("In a HashSet, duplicate values are not allowed : "+hs);

        if (hs.contains(20)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }

        hs.remove(10);

        if(hs.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }

        System.out.println(hs.size());

        hs.clear();
        System.out.println("Now all elements in the set are cleared : "+hs);
    }
}
