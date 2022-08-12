import java.util.ArrayList;
import java.util.Arrays;

// Problem - https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/
// Problem - https://leetcode.com/problems/merge-intervals/

// Explanation - https://www.youtube.com/watch?v=_FkR5zMwHQ0
// This PepCoding video has given the world's best and most detailed explanation

public class Striver_MergeOverlappingSubIntervals {

    public static int[][] merge(int[][] Intervals) {
        // Timestamp - 17:40
        Arrays.sort(Intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        // "for each" loop
        // Timestamp - 24:00
        // Timestamp - 29:00 to see complete dry run
        for(int[] interval : Intervals){
            // add the 1st interval as it is in the list by ourselves
            if(list.size() == 0){
                list.add(interval);
            }
            // 1 interval already exits in the list, wo we'll check whether a new interval will get merged ort not
            else{
                int prevInterval[] = list.get(list.size() - 1); // prevInterval is the previously added interval
                // checking for overlapping
                // [0] means starting point
                // [1] means ending point

                // if overlapping
                if(interval[0] <= prevInterval[1]){
                    prevInterval[1] = Math.max(prevInterval[1], interval[1]);
                }
                // if no overlapping
                else{
                    list.add(interval);
                }
            }
        }
        // .toArray will convert ArrayList into 2-D array
        return list.toArray(new int[list.size()][]);    // list.size will specify the size of the 2-D array
    }

    public static void main(String[] args) {
        int[][] input = new int[5][2];

        input[0][0] = 1;
        input[0][1] = 3;

        input[1][0] = 8;
        input[1][1] = 10;

        input[2][0] = 2;
        input[2][1] = 6;

        input[3][0] = 9;
        input[3][1] = 9;

        input[4][0] = 15;
        input[4][1] = 18;

        int[][] output = merge(input);

        System.out.print("[");
        for(int arr[]: output){
            System.out.print(Arrays.toString(arr)+", ");
        }
        System.out.print("]");
    }
}
