import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/LNGUNIQUE
// Explanation - https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
// Read the code of Method-1 to understand this approach
public class Prepbytes_Hard_LongestUnique_BasicApproach {
    public static boolean checkUniqueString(String str, int i, int j){
        boolean[] arr = new boolean[26];    // Since there are 26 english alphabets
                                                                // By default, all the values in boolean array will be set as false
        for(int k = i; k<=j; k++){
            if(arr[str.charAt(k) - 'a'] == true){   // Getting a true value in boolean array means -> that particular element already exists more than one time,
                                                                        // Because by default, all values will be false, and once we're accessing an element, then we are updating it to true.
                                                                        // So if we get true for any particular element, it means it had already existed in the array, so return false
                return false;
            }
            arr[str.charAt(k) - 'a'] = true;    // Since above condition failed, it means that accessed element has been traversed 1st time, so update it to true so that if next time,
                                                                    // we traverse it again, then this true value will tell us that this element had already been traversed in the array,
                                                                    // i.e. this character already exists in the string
        }
        return true;    // return true if all of above conditions fails (i.e. the string passed in this function is a unique string)
    }
    public static int longestUniqueSubtring(String str){
        int n = str.length();
        int result = 0;

        for(int i=0; i<n; i++){     // each time, we're picking a character of the string from the left and incrementing it.
            for(int j=i; j<n; j++){     // trying out all possible combinations of unique string starting from i (i.e. selected character)
                if(checkUniqueString(str, i, j) == true){   // sending all possible combination of characters for checking unique string
                    result = Math.max(result, j-i+1);   // if yes, then update result with the longest Unique Substring
                }                                                         // j-i+1 -> +1 because i is starting with 0, not 1, so to get accurate length, add 1.
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();

            int len = longestUniqueSubtring(str);
            System.out.println(len);
        }
    }
}
