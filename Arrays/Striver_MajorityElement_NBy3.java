import java.util.ArrayList;
// Problem - https://leetcode.com/problems/majority-element-ii/
// Problem - https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/

// Explanation - https://www.youtube.com/watch?v=yDbkQd9t2ig

public class Striver_MajorityElement_NBy3 {
    public static ArrayList<Integer> majorityElement(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int number1 = -1;
        int number2 = -1;
        int count1 = 0;
        int count2 = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == number1){
                count1++;
            }
            else if(arr[i] == number2){
                count2++;
            }
            else if(count1 == 0){
                number1 = arr[i];
                count1 = 1;
            }
            else if(count2 == 0){
                number2 = arr[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == number1){
                count1++;
            }
            else if(arr[i] == number2){
                count2++;
            }
        }

        if(count1 > n/3){
            ans.add(number1);
        }
        if(count2 > n/3){
            ans.add(number2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};

        ArrayList<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }
}
