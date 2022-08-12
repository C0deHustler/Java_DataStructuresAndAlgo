import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/LNGUNIQUE
// Explanation - https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
// Read the code of Method-2 to understand this approach
// Video for visualization of Sliding Window Approach used in this problem - https://www.youtube.com/watch?v=s2ZGeNeKpuI&t=574s

public class Prepbytes_Hard_LongestUnique_SlidingWindowApproach {
    public static int checkUniqueString(String str){
        // base case
        if(str.length() == 0){
            return 0;
        }

        int n = str.length();
        int result = 0;

        for(int i=0; i<n; i++){
            boolean[] arr = new boolean[256];   // Important -> declare this boolean array inside 1st for loop to avoid errors.
            for(int j=i; j<n; j++){
                if(arr[str.charAt(j)] == true){ // str.charAt(j) will return a character, for e.g. 'e', as per ASCII, 'e' -> 101, so ultimately we're checking for arr[101]
                                                                 // Getting a true value in boolean array means -> that particular element already exists more than one time,
                                                                 // Because by default, all values will be false, and once we're accessing an element, then we are updating it to true.
                                                                // So if we get true for any particular element, it means it had already existed in the array,
                    break;  // so break from the loop
                }
                else{
                    result = Math.max(result, j-i+1);   // if we get false at that particular element, then update result of the longest Unique Substring
                                                                         // j-i+1 -> +1 because i is starting with 0, not 1, so to get accurate length, add 1.
                    arr[str.charAt(j)] = true;// Since above condition failed, it means that accessed element has been traversed 1st time, so update it to true so that if next time,
                                                             // we traverse it again, then this true value will tell us that this element had already been traversed in the array,
                                                              // i.e. this character already exists in the string
                }
            }
            // Most Important step for implementing Sliding Window Approach
            arr[str.charAt(i)] = false; // as soon as we move from one character to other, i.e. increment i, set that element back to false
                                                        // (i.e. treat it as if it has been slided out of the window), see video for better understanding
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();

            int len = checkUniqueString(str);
            System.out.println(len);
        }

    }
}
