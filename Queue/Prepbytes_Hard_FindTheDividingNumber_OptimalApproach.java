import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/REMMAX

public class Prepbytes_Hard_FindTheDividingNumber_OptimalApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //https://www.geeksforgeeks.org/collections-reverseorder-java-examples/
        // We need to use Arrays.sort(arr, Collections.reverseOrder()); for arranging array elements in descending order
        // this will work fine with ‘Array of Objects’ such as the Integer array
        // but will not work with a primitive array such as the int array.
        // That's why declared arr with Integer rather than int since Integer represents Array of Objects'
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = new int[1000001];    // array for storing resultant answer
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        Arrays.sort(arr, Collections.reverseOrder());   // arranging array elements in descending order

        // add all elements of array ( which are in descending order) in the q1
        for(int i=0;i<n;i++) {
            q1.add(arr[i]);
        }

        int i=1;    // since in problem, Query numbers are starting from 1,2,3,....., and each index of arraylist will actually store
                    // the required answer i.e. value at that particular query

        // Dry Run once or see dry run in register to understand the working mechanism of this while loop
        while(true) {   // this loop will run until we'll manually hit break condition inside the loop
            int a = 0, b = -1;  // we can make 'a' as 0 everytime since 'a' represents peek of q1, and q1 will always get empty first
                                // ( read ahead to know why)
                                // but 'b' will be updated as -1 always, because when 'b' will become 0, it will be a signal to come out of this loop
                                // ( read ahead to know why)
            if (!q1.isEmpty()) {
                a = q1.peek();
            }
            if (!q2.isEmpty()) {
                b = q2.peek();  // Condition 1 - once all elements will become 1 in both queues, then a point will come when 0 (e.g. 1/2 = 0)
                                // will become the peek of queue, this point will be a signal to stop this all and come out of while loop
            }

            if (a >= b && b != 0) { // Condition - 1
                q1.remove();    // remove from q1
                q2.add(a / 2);  // add in q2
                result[i++] = a;    // add answer in result array
            }
            else if (b > a && b != 0) { // Condition - 1
                q2.remove();    // remove from q2
                q2.add(b / 2);  // add in q2 ( we'll remove from both q1 and q2 depending upon if and else if conditions, but we'll always add in q2,
                                // that's why q1 will get empty 1st, and q2 will never become empty,
                                // but a point will come when only 0's will be left in q2
                result[i++] = b;    // add answer in result array
            }
            else {
                break;  // break when b == 0 (i.e. q2.peek() == 0 ) Condition - 1
            }
        }
        for(int j=0;j<m;j++){
            int q=sc.nextInt();
            int ans = result[q];
            if(ans != 0){
                System.out.println(ans);
            }
        }
    }
}
