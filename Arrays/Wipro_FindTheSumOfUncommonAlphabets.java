import java.util.HashSet;

public class Wipro_FindTheSumOfUncommonAlphabets {
    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }

        return sumOfDigits(n%10 + sumOfDigits(n/10));
    }

    public static int solve(char[] input1, char[] input2){
        HashSet<Character> set = new HashSet<>();

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
        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'B', 'C'};

        int ans = solve(arr1, arr2);
        System.out.println(ans);

    }
}
