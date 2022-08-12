// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/9737739f28434d819c0c813aa70a951e
// T.C - O(n)

public class Prepbytes_ClosestNumberInSortedArray_BruteForce {
    public static int solve(int[] arr, int k){
        // if k exists before starting of the array
        if(k <= arr[0]){
            return 0;
        }
        // if k exists after ending of the array
        else if(k >= arr[arr.length - 1]){
            return arr.length - 1;
        }
        // if k exists in between the array
        int currDiff = 0;
        int minDiff = Math.abs(k - arr[0]);
        int ansIndex = 0;

        for(int i=0; i<arr.length; i++){
            currDiff = Math.abs(arr[i] - k);
            if(currDiff < minDiff){ // the more minimum the difference, the more closer is k to the element
                minDiff = currDiff;
                ansIndex = i;
            }
        }
        return ansIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 11, 12, 15, 16};
        int k = 7;
        int l = 14;
        int m = 0;
        int n = 18;

        int ans1 = solve(arr, k);
        System.out.println(k+" is closest to "+arr[ans1]);

        int ans2 = solve(arr, l);
        System.out.println(l+" is closest to "+arr[ans2]);

        int ans3 = solve(arr, m);
        System.out.println(m+" is closest to "+arr[ans3]);

        int ans4 = solve(arr, n);
        System.out.println(n+" is closest to "+arr[ans4]);
    }
}
