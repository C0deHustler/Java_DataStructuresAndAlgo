// Problem - https://leetcode.com/problems/plus-one/

public class LeetCode_Easy_PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }

        // Very smart move, create a new array having size of 1 greater than the older array, and make its 0th element as 1, since by default,
        // default values in an array are 0, so just return this new array, and we'll get desired ans.
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,7};
        int[] ans = plusOne(arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] arr2 = {9,9,9,9};
        int[] ans2 = plusOne(arr2);
        for(int ele : ans2){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
