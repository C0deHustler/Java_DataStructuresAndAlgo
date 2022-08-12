import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/POWERLEX
// Explanation - https://www.geeksforgeeks.org/powet-set-lexicographic-order/
// Dry run is must for deep understanding
public class Prepbytes_Medium_PowerSetOfStrings {
    public static void recursivePermutation(String str, int n, int index, String current){
        // Base case
        if(index == n){
            return;
        }
        System.out.println(current);

        for(int i=index+1; i<n; i++){
            current = current + str.charAt(i);
            recursivePermutation(str, n, i, current);

            // BackTracking
            current = current.substring(0, current.length()-1); // Removing the last character after each iteration
        }
        return;
    }
    public static void powerSet(String str){
        int n = str.length();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        recursivePermutation(new String(ch), n, -1, "");     // new String(ch) -> converting char array to string
        // index has been set as -1 for purpose, don't put 0 there, because in recursivePermutation() function,
        // for loop will be initiated with i = index+1, so this extra +1 each time will help in getting our ans. (dry run for understanding)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        powerSet(str);
    }
}
