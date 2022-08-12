import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/SMALLNUM
public class Prepbytes_Easy_SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[100001];   // 0 <= arr[i] <= 10^5, that's why 100001, 100000 -> wrong, 100001 -> right, because loop will run till < freq.length, so 1 extra size for accessing last element
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            freq[arr[i]]++; // creating a count array to keep count of each element
                                    // by using count array, we will automatically access the elements from smallest to largest element.
            // Thus by this, we will satisfy this condition -> Output the smallest number in the array which occurs exactly K times in an array.
        }
        int k = sc.nextInt();

        for(int i=0; i<freq.length; i++){
            if(freq[i] == k){
                System.out.println(i);
                break;
            }
        }
    }
}
