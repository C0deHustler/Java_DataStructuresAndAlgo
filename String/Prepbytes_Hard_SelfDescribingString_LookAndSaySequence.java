import java.util.Scanner;
// Problem - https://www.geeksforgeeks.org/look-and-say-sequence/
// Problem - Prepytes Strings Hard

public class Prepbytes_Hard_SelfDescribingString_LookAndSaySequence {
    // Returns nth term in look-and-say sequence
    public static String lookAndSay(int n){
        // Base cases
        if(n == 1)      return "1";
        if(n == 2)     return "11";

        // Find nth term by generating all terms from 3 to n-1. Every term is generated using previous term

        // Initialize previous term
        String str = "11";
        for(int i=3; i<=n; i++){
            // In below 2nd "for" loop, previous character is processed in current iteration.
            // That is why a dummy character is added to make sure that loop runs one extra iteration.
            str = str+"$";
            int len = str.length();
            String temp = "";   // Initialize ith term in series
            int count = 1;  // Initialize count of matching chars

            for(int j=1; j<len; j++){   // Process previous term to find the next term
                if(str.charAt(j) != str.charAt(j-1)){ // If current character doesn't match
                        temp += count;  // Append count of str[j-1] to temp
                        temp += str.charAt(j-1);   // Append str[j-1]
                        count = 1;  // Reset count
                }
                else{   // If matches, then increment count of matching characters
                    count++;
                }
            }
            str = temp; // Update str
        }
        return str;
    }
    public static void main(String[] args) {
        int n = 4;
        String ans = lookAndSay(n);
        System.out.println(ans);
    }
}
