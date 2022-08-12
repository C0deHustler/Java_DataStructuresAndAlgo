import java.util.*;
import java.io.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/MAJORITY
public class Prepbytes_Medium_MajorityVotes {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] freq = new int[1000001];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                freq[arr[i]]++;
            }

            int maxVote = Integer.MIN_VALUE;
            int maxVoteNominee = -1;

            for(int i=0; i<freq.length; i++){
                if(freq[i] > maxVote){
                    maxVote = freq[i];
                    maxVoteNominee = i;
                }
            }
            int decider = n/2;
            if(maxVote > decider){
                System.out.println(maxVoteNominee);
            }
            else{
                System.out.println(-1);
            }
        }

    }
}