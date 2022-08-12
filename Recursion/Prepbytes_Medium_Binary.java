import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/BINARY1
// Explanation Video - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/video/b1a926b4436c4892915554178f8013b9
// See pics Notes
public class Prepbytes_Medium_Binary {
    public static void binary(int[] a, int n, int k){
        if(k == n){ // if k becomes equal to n i.e. we've filled the required gaps with 0's and 1's, then print the array
            for(int i=0; i<n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        if(a[k-1] == 0){    // when previous element is 0,
            a[k] = 0;   // then we can either set 0 as current element,
            binary(a, n, k+1);
            a[k] = 1;   // or set 1 as current element
            binary(a, n, k+1);
        }
        else{
            // when previous element is 1,
            a[k] = 0;   // then we can set only 0 as current element,
            binary(a, n, k+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            a[0] = 0;   // To get answer in lexicographical order, we'll call binary method by putting 0 as the 1st element of array to get the first half of the recursion tree
            binary(a, n, 1);    // k will be the current index (here, k=1) where 0 or 1 will be put, because we've already initialized a[0] = 0.

            a[0] = 1;   // Then we'll call binary method by putting 1 as the 1st element of array to get other half of the recursion tree
            binary(a, n, 1);    // k will be the current index (here, k=1) where 0 or 1 will be put, because we've already initialized a[0] = 1.
        }
    }
}
