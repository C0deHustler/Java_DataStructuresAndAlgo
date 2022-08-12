// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/6988ed3771bf40d79b17a23fb96eca3d
// T.C - O(k)

public class Prepbytes_DivisibleNumber_BruteForce {
    public static int solve(int a, int b, int k){
        int count = 0;
        int i = 1;
        while(count != k){
            if(i % a == 0 || i % b == 0){
                count++;
            }
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int k = 10;

        int ans = solve(a, b, k);
        System.out.println(ans);
        // final ans array -> [2, 3, 4, 6, 8, 9, 10, 12, 14, 15], 15 is the 10th number divisible by either a = 2 or b = 3
    }
}
