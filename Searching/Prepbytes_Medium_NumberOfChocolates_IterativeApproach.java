import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/NUMCHOC
public class Prepbytes_Medium_NumberOfChocolates_IterativeApproach {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);   // sort the array in increasing order
        int q=sc.nextInt();
        while(q-->0){
            int query=sc.nextInt();
            int left=0;
            int right=n-1;
            int choc=0;

            while(left<=right){
                int mid=left+((right-left)/2);  // finding mid-element each time for updated array having new left and right pointers
                if(arr[mid]<=query && (mid+1>right || arr[mid+1]>query)){   // This is the main "if", because if everything goes fine here, then we'll print the answer and break the loop.
                                                                                                                // ( mid-element must be less than or equal to query element )
                                                                                                                //                                      AND
                                                                                                                // ( ( 1. mid+1>right -> to ensure that we have reached the last element of our array)
                                                                                                                //                                              OR
                                                                                                                // ( 2. arr[mid+1]>query -> to ensure that crossed our query element ) )
                    choc=mid+1;
                    break;
                }
                else if(arr[mid]<=query){   // continue the search in 2nd half (by making left = mid+1), since our query can still go the 2nd part
                    left=mid+1;
                }
                else{   // continue the search in 1st half(by making right = mid-1), since our mid-element > query.
                    right=mid-1;
                }
            }
            System.out.println(choc);
        }
    }
}