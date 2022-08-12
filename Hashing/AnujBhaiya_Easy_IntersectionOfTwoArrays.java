import java.util.HashSet;
// Problem and Explanation - https://www.youtube.com/watch?v=FEQSlOQa5po&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=29
public class AnujBhaiya_Easy_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        int[] arr1 = {5, 10, 15, 5, 10, 7, 2};
        int[] arr2 = {15, 5, 5, 10, 4, 2, 9};

        for(int ele: arr1){
            s.add(ele);
        }

        int count = 0;
        for(int ele: arr2){
            if(s.contains(ele)){
                count++;
                s.remove(ele);
            }
        }

        System.out.println("Number of elements after intersection: "+count);
        // Array after intersection: {5, 10, 15, 2}
    }
}
