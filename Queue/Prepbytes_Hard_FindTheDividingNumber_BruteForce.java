import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/REMMAX
// Brute force because, it will give wrong answer for large values
public class Prepbytes_Hard_FindTheDividingNumber_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Elements will be stored in reverse order in priorityQueue using this Collections method
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        int q = sc.nextInt();

        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            priorityQueue.add(val); // elements will be dynamically stored in such a way that largest element will always be returned first
        }

        // An ArrayList to store final result
        ArrayList<Integer> arrayList = new ArrayList<>();

        // we'll add 0 element at index 0 , since in problem, Query numbers are starting from 1,2,3,....., and each index of arraylist will
        // actually store the required answer i.e. value at that particular query
        arrayList.add(0);
        int count = 0;  // count will keep track that when all the elements of PriorityQueue has become 1
        while(priorityQueue.peek() != 1){   // peek will always return largest element, and if peek has become 1,
                                            // it means that now all elements have become 1
            arrayList.add(priorityQueue.peek());    // in each iteration, we'll add peek(i.e. the largest element) in the result arrayList
            int x = priorityQueue.poll() / 2;   // then we'll remove that element and divide it by 2 and store in x
            priorityQueue.add(x);   // and then again add this x back in PriorityQueue
            count++;    // increment count
        }

        while(q-- > 0){
            int z = sc.nextInt();   // inputting queries
            if(z <= count){ // it shows that till the query number is less than count (i.e. till this time, all elements have not become 1)
                System.out.println(arrayList.get(z));   // then return the elements at that particular index
            }
            else{
                System.out.println(1);  // else 1, because when all elements are 1, then largest element is also 1
            }
        }
    }
}

