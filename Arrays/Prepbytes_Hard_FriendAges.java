import java.io.IOException;
import java.util.*;

public class Prepbytes_Hard_FriendAges {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Size of array
        int[] arr = new int[n]; // Array for storing different ages
        int[] freq = new int[121];  // Declaring a freq array for storing count of each age. Size will be 121 since maximum age limit is given as 120
        for(int i=0; i<121; i++){
            freq[i] = 0;    // Initializing all elements of freq array as 0.
        }

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();  // Input of ages from user
            freq[arr[i]]++; // Maintaining count of each age in the freq array
        }

        int request = 0;
        for(int i=0 ;i<121; i++){   // Since max age limit is 120, so we'll iterate till <121
            int count = 0;  // after each iteration, count variable will be re-initialized to 0.
            for(int j=1; j<121; j++){   // We will pick each index, and iterate it with all rest of the indexes.
                if(freq[i] == 0 || freq[j] == 0){   // freq[i] == 0 or freq[j] == 0 means that the particular age does not even exist(not given by the user as input in a range of 1 to 120),
                                                                    // so continue and move to next iteration.
                    continue;
                }
                else if((j <= 0.5*i + 7) || (j > 100 && i < 100) || (j > i)){   // if any one of the conditions become true, this means that age cannot send friend request,
                                                                                                        // so continue and move to next iteration
                    continue;
                }
                else if( i == j){   //if i==j means same age and if it is same age then the number of requests will be
                                          // (suppose there are x people of same age then number of request for each will be x-1 so total request will be x*x-1)
                    count += (freq[i]) * (freq[i]-1);
                }
                else{   //and if not then requests will be x * y people
                           // in above selection statements, we've already checked for all the possible cases, so here, we will just keep adding product of count of i and j in the freq array
                    count += freq[j] * freq[i];
                }
            }
            request += count;
        }
        System.out.println(request);
    }
}