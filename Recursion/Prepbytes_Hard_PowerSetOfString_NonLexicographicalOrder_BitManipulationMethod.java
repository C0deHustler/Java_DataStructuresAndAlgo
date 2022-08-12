import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/POWERLEX
// Explanation - https://www.youtube.com/watch?v=b7AYbpM5YrE

// This code not acceptable, since it will not give result in lexicographical order, but still it will give all possible outcomes
public class Prepbytes_Hard_PowerSetOfString_NonLexicographicalOrder_BitManipulationMethod {
    public static void powerSet(String str){
        int n = str.length();

        for(int i=0; i<(1<<n); i++){    // if str = "abc", i.e. n = 3, so total solutions = 2^n -> 2^3 -> 8, hence, loop will run from 0 to 7 (i.e. n-1 ->8-1) , i.e. total 8 times
                                                    // starting from 0, because as video explanation, 000 -> " ", 001 -> "a", 011 -> "ab", and so on.....
            String ans = "";
            for(int j=0; j<n; j++){     // j from 0 to n-1 so that it can try all possible combinations,
                // Get Bit Logic
                if((i & (1 << j)) != 0){    // for each i, we will check all possible combinations of j (i.e. j from 0 to n-1), and if we will get a bit (i.e. 1), then we will place a character at that index
                    ans += str.charAt(j);
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        powerSet(str);
    }
}
