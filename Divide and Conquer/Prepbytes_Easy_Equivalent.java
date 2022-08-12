import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/EQSTRS
// Explanation - https://www.geeksforgeeks.org/check-whether-two-strings-are-equivalent-or-not-according-to-given-condition/

// Time Complexity: O(N*logN), where N is the size of the string.
// Auxiliary Space: O(logN)

public class Prepbytes_Easy_Equivalent {
    // This method will sort all the characters of the string
    public static String recSort(String str){
        // if string cannot be divided into 2 equal halves
        if(str.length() % 2 != 0){
            return str;
        }

        String str1 = recSort(str.substring(0, str.length()/2));    // Sending 1st half of the string
        String str2 = recSort(str.substring(str.length()/2));   // Sending 2nd half of the string

        // if str1 and str2 are already in sorted order then return them as it is just by concatenating them in same order
        if(str1.compareTo(str2) < 0){
            return str1+str2;
        }
        // if str1 and str2 are not in sorted order then return them by concatenating them in inverse order
        else{
            return str2+str1;
        }
    }
    public static void main(String args[]) throws IOException {
        String str1 = "abaa";
        String str2 = "aaab";

        // Modifying the original string by sending them tho the method, and sorting their each character in sorted order
        str1 = recSort(str1);
        str2 = recSort(str2);

        // After sorting, if both strings are same, it means they are equivalent
        if(str1.equals(str2)){
            System.out.println("YES");
        }
        // or else not equivalent
        else{
            System.out.println("NO");
        }


        String str3 = "abab";
        String str4 = "aabb";

        str3 = recSort(str3);
        str4 = recSort(str4);

        if(str3.equals(str4)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}