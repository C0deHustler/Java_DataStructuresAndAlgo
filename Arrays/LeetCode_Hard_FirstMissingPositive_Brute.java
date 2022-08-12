public class LeetCode_Hard_FirstMissingPositive_Brute {
    public static int solve(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            max = Math.max(max, j);
        }

        int ans = 0;
        boolean ansFound = false;
        for(int i=1; i<=max; i++){
            int flag = 0;
            for(int j=0; j<arr.length; j++){
                if(i == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                ans = i;
                ansFound = true;
                break;
            }
        }

        if(ansFound){
            return ans;
        }
        else if(max < 0){
            return 1;
        }
        else{
            return max+1;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 12, 4, 1, 2, -1, 8};
        int ans1 = solve(arr1);
        System.out.println(ans1);

        int[] arr2 = {1,2,0};
        int ans2 = solve(arr2);
        System.out.println(ans2);

        int[] arr3 = {3,4,-1,1};
        int ans3 = solve(arr3);
        System.out.println(ans3);

        int[] arr4 = {7,8,9,11,12};
        int ans4 = solve(arr4);
        System.out.println(ans4);
    }
}
