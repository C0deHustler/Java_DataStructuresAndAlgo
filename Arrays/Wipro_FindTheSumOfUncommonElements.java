import java.util.HashSet;

public class Wipro_FindTheSumOfUncommonElements {
    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }

        return sumOfDigits(n%10 + sumOfDigits(n/10));
    }
    public static int solve(int[] input1, int[] input2){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<input1.length; i++){
            set.add(input1[i]);
        }

        for(int i=0; i< input2.length; i++){
            if(set.contains(input2[i])){
                set.remove(input2[i]);
            }
            else{
                set.add(input2[i]);
            }
        }

        int sum = 0;
        for(int ele: set){
            sum += ele;
        }

        int ans = sumOfDigits(sum);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {123, 45, 7890, 67, 2, 90};
        int[] arr2 = {45, 7890, 123};

        int ans = solve(arr1, arr2);
        System.out.println(ans);

        int[] arr3 = {6, 7, 12, 70, 44};
        int[] arr4 = {8, 6, 70, 44};

        int ans2 = solve(arr3, arr4);
        System.out.println(ans2);

        int[] arr5 = {2, 7, 8, 9};
        int[] arr6 = {1, 7839, 8, 2};

        int ans3 = solve(arr5, arr6);
        System.out.println(ans3);
    }
}
