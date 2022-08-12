import java.util.Arrays;
// Problem - https://leetcode.com/problems/first-missing-positive/submissions/

// Explanation -
// 1. Sort the array
// 2. Traverse the array until we skip all elements which are less than or equal to zero, since we need first positive number as the answer.
// 3. minPositive will be the smallest positive number of the array, because minPositive number is greater than 1, then obviously our answer is 1.
// 4. Since array is sorted, so we'll check if 2 consecutive numbers do not come one after the other(i.e. {4,5,7,8}, gap is btw 5 and 7),
//    so this gap will be our first positive missing number. So till the time this problem is not occurring, we'll continue.
// 5. Also, in sorted array, if 2 or more numbers consecutive numbers are same, so we need to skip them, so continue.
//    (see code for better understanding)
// 6. Else, if Point-4 get violated anywhere, then that number will be our first positive missing number, so we'll store our answer, and break.
// 7. At last, if the largest element of array is less than or equal to 0, then 1 will be the answer.
// 8. Or if smallest number of array is greater than 1, then still 1 as the answer.
// 9. or minPositive is greater than 1, still our answer will be 1.
// 10. if flag == 0, which means that we traversed the whole array and none of the above conditions got hit, so that means,
//     our first positive missing number exists beyond our array, i.e. answer will be element just after the last element of the array
//     i.e. max+1 (since array is sorted, so max will be the last element of the array).
// 11. else return the ans that we got when any one of the above discussed situation got hit.

public class LeetCode_Hard_FirstMissingPositive_Better {
    public static int function(int[] arr){
        Arrays.sort(arr);   // 1.

        int ans = 0;
        int flag = 0;
        int minPositive = 0;
        for(int i=0; i<arr.length-1; i++) { // 2.
            if(arr[i] <= 0){
                minPositive = arr[i+1]; // 3.
                continue;
            }   //              4.                       5.
            else if (arr[i] + 1 == arr[i + 1] || arr[i] == arr[i+1]) {
                continue;
            }
            else{   // 6.
                flag = 1;
                ans = arr[i] + 1;
                break;
            }
        }

        int max = arr[arr.length - 1];
        int min = arr[0];

        //    7.         8.            9.
        if(max <= 0 || min > 1 || minPositive > 1){
            return 1;
        }
        else if(flag == 0){ // 10.
            return max+1;
        }
        else{   // 11.
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 12, 4, 1, 2, -1, 8};
        int ans1 = function(arr1);
        System.out.println(ans1);

        int[] arr2 = {1,2,0};
        int ans2 = function(arr2);
        System.out.println(ans2);

        int[] arr3 = {3,4,-1,1};
        int ans3 = function(arr3);
        System.out.println(ans3);

        int[] arr4 = {7,8,9,11,12};
        int ans4 = function(arr4);
        System.out.println(ans4);

        int[] arr5 = {1};
        int ans5 = function(arr5);
        System.out.println(ans5);
    }
}
