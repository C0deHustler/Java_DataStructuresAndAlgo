import java.util.HashSet;

public class Wipro_FindTheSumOfCommonAlphabets {
    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }

        return sumOfDigits(n%10 + sumOfDigits(n/10));
    }

    public static int solve(char[] input1, char[] input2){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i=0; i<input1.length; i++){
            set1.add(input1[i]);
        }

        for(int i=0; i< input2.length; i++){
            if(set1.contains(input2[i])){
                set2.add(input2[i]);
            }
        }


        int sum = 0;
        for(int ele: set2){
            sum += ele - 'a' + 97;
        }

        int ans = sumOfDigits(sum);
        return ans;
    }
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'b', 'c'};

        int ans = solve(arr1, arr2);
        System.out.println(ans);

        char[] arr3 = {'g', 'q', 'r'};
        char[] arr4 = {'r', 't', 'u'};

        int ans2 = solve(arr3, arr4);
        System.out.println(ans2);

    }
}
