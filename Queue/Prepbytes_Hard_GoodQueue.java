// Java implementation of the approach
import java.util.*;

class GFG {
    // Maximum possible valid number
    static int MAX = 543210;

    // To store all the required number from the range [1, MAX]
    static Vector<String> ans = new Vector<String>();

    // Function that returns true if x satisfies the given conditions
    static boolean isValidNum(String x) {
        // To store the digits of x
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int i = 0; i < x.length(); i++) {
            // If current digit appears more than once
            if (mp.containsKey(x.charAt(i) - '0')) {
                return false;
            }
            // If current digit is greater than 5
            else if (x.charAt(i) - '0' > 5) {
                return false;
            }
            // Put the digit in the map
            else {
                mp.put(x.charAt(i) - '0', 1);
            }
        }
        return true;
    }

    // Function to generate all the required numbers in the range [1, MAX]
    static void generate() {
        // Insert first 5 valid numbers
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");
        q.add("5");

        boolean flag = true;

        // Inserting 0 externally because 0 cannot be the leading digit in any number
        ans.add("0");

        while (!q.isEmpty()) {
            String x = q.peek();
            q.remove();

            // If x satisfies the given conditions
            if (isValidNum(x)) {
                ans.add(x);
            }
            // Cannot append anymore digit as adding a digit will repeat one of the already present digits
            if (x.length() == 6)
                continue;

            // Append all the valid digits one by one and push the new generated number to the queue
            for (int i = 0; i <= 5; i++) {
                String z = String.valueOf(i);
                // Append the digit
                String temp = x + z;
                // Push the newly generated number to the queue
                q.add(temp);
            }
        }
    }

    // Function to compare two Strings which represent a numerical value
    static boolean comp(String a, String b) {
        if (a.length()== b.length()) {
            int i = a.compareTo(b);

            return i < 0;
        }
        else
            return a.length() < b.length();
    }

    // Function to return the count of valid numbers in the range [l, r]
    static int findcount(String l, String r) {
        // Generate all the valid numbers in the range [1, MAX]
        generate();
        // To store the count of numbers in the range [l, r]
        int count = 0;
        // For every valid number in the range [1, MAX]
        for (int i = 0; i < ans.size(); i++) {
            String a = ans.get(i);
            // If current number is within the required range
            if (comp(l, a) && comp(a, r)) {
                count++;
            }
            // If number is equal to either l or r
            else if (a == l || a == r) {
                count++;
            }
        }
        return count;
    }

    // Driver code
    public static void main (String[] args) {
        String l = "3", r = "17";
        int ANS = findcount(l, r);
        System.out.println(ANS);
    }
}
